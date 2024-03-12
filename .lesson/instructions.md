# Assignment 2 - Calculation

## Learning outcomes
The student must show ability and skill in structuring their code so that it is clear and easy to follow for another programmer, to read in input from the user and convert to a suitable data type for further processing, to print formatted data to the user and to handle the String data type.

## Prerequisites
The assignment presupposes that you have studied the material in step 2 and bring with you knowledge and feedback from Assignment 1.

## Task
You will create a program that calculates how much money your solar cells generate per day based on the number of hours of sunshine.

Begin the task by constructing a flow chart and program logic on paper. Then describe your structure in text form (pseudocode) in the comment header of the program so that an outsider can understand what the program does and how your logic / algorithm works.

You have installed solar cells on your roof and want to calculate how much you earn on a sunny summer day.
You have bought 26 solar panels that are each 1.7x1 m in size and can produce a maximum of 290 W.

## Assumptions
- You have installed your solar panels in a straight south position and have an ideal roof angle (35-45 degrees).
- The solar radiation in Skellefteå on a sunny summer day (June / July) is on average 166 Wh / m2 / hour.
- The efficiency of the solar cell ([Thermal efficiency](https://en.wikipedia.org/wiki/Thermal_efficiency)) is assumed to be 20% (of the solar radiation).
- The electricity price is assumed to be SEK 0.9 / kWh (including 60 öre tax rebate).

Production (Wh) = Solar radiation (Wh / m2 / hour) x efficiency x surface (m2) x hours of sunshine

The user enters what time the sun rises and what time it sets. Use Scanner for input (not dialog boxes). The time is entered in the form hh: mm.

The program must first calculate the number of hours of sunshine, then what production takes place and finally what profit the sale of the entire production gives.

Present the results to two decimal places, use printf to format the printout. 

We assume in the program that all entered times are valid for the same day. You should check entered values ​​so that the "date" is in June / July (month 6 or 7) and that the time of sunset is later than sunrise. For all other values, the program should give an error message and quit.

## Example run
```
Enter today's date [mm-dd]> 06-22
Enter time of sunrise [hh: mm]> 01:46
Enter time of sunset [hh: mm]> 23:28
========================================== 
Sun hours: 21.70 hours 
The production on 22/6 is: 31.84 kWh to a value of: SEK 28.66
```
## Separator
You are supposed to use useDelimiter to specify the separator when loading according to program run above, read more about this in Practice Problem (IO and Strings - Time converter) and  Question Bank 3 (Uppgiftsbank 3) . Think about the appropriate way to handle dates. You can also consider decimal places, see Question Bank 3.1 (Uppgiftsbank 3.1) on Canvas

## Selection / Terms
In your program you need to handle a selection situation (check if a condition is met). Your program logic should perform certain statements only if the condition is met. Read more about if statements in the book (Section 2.8 deals with "Decision making: Equality and Relational operators").

## Submit the solution
Before submitting the file, check that your code follows the course's requirements for formatting and coding rules (see corresponding criteria in the correction matrix on replit). 

## Plagiarism 
When writing the code, make the code your own. Submissions may be checked for plagiarism and in the event of cheating risk the student reporting to the university's Disciplinary Board.

## Correction
If you submit on time, you should normally have the information corrected no later than 3 weeks after the deadline. 

NOTE! If you encounter problems so you can not complete the task, ask the supervisor instead of submitting a half-finished solution. 

The teacher marks how well the code meets resp. the criterion in the correction matrix. Submissions that do not reach the lowest level of compliance will fail. Any failed submissions must be reworked to achieve an approved level and then resubmitted (click on "Submit again").  