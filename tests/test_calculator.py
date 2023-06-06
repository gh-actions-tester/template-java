import subprocess
import pytest

def test_calculator_addition():
    command = ["java", "-jar", "solution.jar", "5", "+", "3"]

    result = subprocess.run(command, text=True, capture_output=True)

    assert result.stdout.strip() == "8.0", "The addition operation failed"
    
def test_calculator_subtraction():
    command = ["java", "-jar", "solution.jar", "5", "-", "3"]

    result = subprocess.run(command, text=True, capture_output=True)

    assert result.stdout.strip() == "2.0", "The subtraction operation failed"

def test_calculator_multiplication():
    command = ["java", "-jar", "solution.jar", "5", "*", "3"]

    result = subprocess.run(command, text=True, capture_output=True)

    assert result.stdout.strip() == "15.0", "The multiplication operation failed"
    
def test_calculator_division():
    command = ["java", "-jar", "solution.jar", "6", "/", "3"]

    result = subprocess.run(command, text=True, capture_output=True)

    assert result.stdout.strip() == "2.0", "The division operation failed"
    
def test_calculator_division_by_zero():
    command = ["java", "-jar", "solution.jar", "6", "/", "0"]

    result = subprocess.run(command, text=True, capture_output=True)

    assert result.returncode == 1, "The division by zero operation failed to return expected error code"