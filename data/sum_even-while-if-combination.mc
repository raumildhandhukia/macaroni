start
int number = 1;
int sum = 0;
bool isEven = false;
while ((number <= 10)) {
    if (isEven) {
        sum = sum + number;
    }
    number = number + 1;
    isEven = (not isEven);
}
# 30 should be printed.
print(sum);
end