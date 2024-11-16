let display = document.getElementById("display");
let currentValue = "";

function appendValue(value) {
  currentValue += value;
  display.value = currentValue;
}

function clearDisplay() {
  currentValue = "";
  display.value = "0";
}

function toggleSign() {
  if (currentValue) {
    if (currentValue.startsWith("-")) {
      currentValue = currentValue.substring(1);
    } else {
      currentValue = "-" + currentValue;
    }
    display.value = currentValue;
  }
}

function operate(operator) {
  currentValue += operator;
  display.value = currentValue;
}

function calculate() {
  try {
    currentValue = eval(currentValue).toString();
    display.value = currentValue;
  } catch (error) {
    display.value = "Error";
    currentValue = "";
  }
}