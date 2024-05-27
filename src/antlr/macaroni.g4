grammar macaroni;

@header {
    package antlr;
}

// Lexer rules
INT: [0-9]+;
STR: '"' .*? '"';
BOOL: 'true' | 'false';
UNARY_OP: '++' | '--';
ID: [a-zA-Z]+ [a-zA-Z0-9]*;
AND : '&&';
OR : '||';
IS_EQUAL : '==';
IS_NOT_EQUAL : '!=';
IS_GREATER  : '>';
IS_LESS  : '<';
IS_GREATER_EQUAL : '>=';
IS_LESSER_EQUAL : '<=';
ADD: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
TERNARY_TRUE : '?';
TERNARY_FALSE : ':';
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;

// Parser rules
program: 'start' block 'end' EOF;

block : statement*;

statement: variable_declaration
         | assignment
         | if_statement
         | for_statement
         | for_in_range_statement
         | while_statement
         | print_statement
         | expression ';';

variable_declaration: data_type ids | data_type ID '=' expression ';';
ids : ID ';' | ID ',' ids ;

assignment: ID '=' expression ';';

if_statement: 'if' '(' expression ')' '{' if_statements '}'
             ( 'else' '{' else_statements '}' )?;
if_statements : statement*;
else_statements : statement*;
operation : ID UNARY_OP;
for_statement: 'for-loop' '(' variable_declaration  expression ';' operation ')' '{' statement* '}';

for_in_range_statement: 'for' '(' ID 'in' 'range' '(' expression ',' expression ')' ')' '{' statement* '}';

while_statement: 'while' '(' expression ')' '{' statement* '}';

print_statement:  'print' '(' expressions ')' ';';
expressions: expression | expression ',' expressions ;

//expression: primary (relational_op) primary
//          | '(' primary (logical_op) primary ')'
//          | primary (mul_div) primary
//          | primary ((add_minus) primary)*
//          | expression '?' expression ':' expression
//          | 'not' expression
//          | primary
//          | '(' expression ')';

expression : arithmetic_expression
    | logical_expression
    | relational_expression
    | ternary_expression
    | '(' expression ')';

arithmetic_expression
    : arithmetic_expression mul_div arithmetic_expression
    | arithmetic_expression add_minus primary
    | primary
    ;

relational_expression :
        | '(' arithmetic_expression relational_op arithmetic_expression ')';

logical_expression
    : '(' logical_expression (logical_op) logical_expression ')'
    | '(' 'not' logical_expression ')'
    | primary ;

ternary_expression : (relational_expression|logical_expression) TERNARY_TRUE expression TERNARY_FALSE expression ;

primary: INT
       | STR
       | BOOL
       | ID;
logical_op : AND | OR;
add_minus : ADD | MINUS ;
mul_div : MUL | DIV ;
relational_op : IS_EQUAL | IS_NOT_EQUAL | IS_GREATER | IS_LESS | IS_GREATER_EQUAL | IS_LESSER_EQUAL;
data_type: 'int' | 'str' | 'bool';