# Moded Calculator with SMS Sending Feature

This Android application is a moded calculator that performs basic arithmetic operations and has an additional hidden feature of sending SMS messages. The calculator allows users to perform addition, subtraction, multiplication, and division.

## Features

- Perform arithmetic calculations: Addition, Subtraction, Multiplication, and Division.
- Hidden feature: Send SMS messages.

## Prerequisites

- Android device or emulator running Android OS.
- Android Studio (for development and building the application).

## Installation

1. Clone the repository using the following command:
   ```
   git clone https://github.com/Elio-Chedid/lets-cook.git
   ```

2. Open the project in Android Studio.

3. Build and run the application on your Android device or emulator.

## Usage

1. Launch the application on your Android device.

2. Use the calculator interface to perform arithmetic calculations.

3. To access the hidden feature (sending SMS messages), follow these steps:
   - Long press the "Sign" button five times.
   - The application will switch to the SMS sending screen.

4. On the SMS sending screen:
   - Enter the phone number of the recipient in the "Phone" field.
   - Enter the delay (in milliseconds) for sending the SMS in the "Delay" field.
   - Click the "Submit" button to send the SMS message.

5. The SMS message will be sent after the specified delay, and the app will display a toast message indicating the status of the SMS delivery.

## Permissions

The application requires the following permission to send SMS messages:

- `SEND_SMS`: Allows the app to send SMS messages.

Please ensure that the necessary permissions are granted when prompted to send SMS messages.
