## Problem Description

The problem has appeared int leetCode monthly code challenge. Here we are implementing a program as our calendar. Events are to be added on the calendar only if a newly event being added doesn't cause a `double booking`, i.e. A double booking happens when two events appear on the same time.
The events are presented as a pair of integers `start` and `end` representing a booking on the half-open interval `[start, end)`, the range of real numbers `x` such that `start <= x < end`.

- <App()> initializes the calendar object.
- <booolean book(int start, int end) > Returns <true> if the event can be added to the calendar successfully without causing a <double booking>. Otherwise, returns <false> and do not add the event to the calendar.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
- `test`: the folder conatins the test cases against the problem

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
