# parse_json_xml
Application that parses a menu file, sorts it according to the attribute

## Requirements
* Java
* Use at least the two attached files – menu.xml and menu.json

## Deliverables
* Source code (including tests)
* Executable jar

## Assignment description

Write a runnable application that parses a menu file, sorts it according to the attribute “name” and prints the menu with details to the console. Solve this assignment with focus on good OOP practices. Make assumptions accordingly.

Command line arguments:
* File name
* Sort order

Run examples:

java –jar menu.jar menu.xml asc
java –jar menu.jar menu.json desc

# Solution 
Solution can be found [here](https://github.com/ray4ik/parse_json_xml)

## Setting up
Go to [GitHub](https://github.com/ray4ik/parse_json_xml) and download repository: 

```bash
git clone https://github.com/ray4ik/parse_json_xml.git 
```

Or
```bash
git clone git@github.com:ray4ik/parse_json_xml.git
```
## How to run application 
Go to folder parse_json_xml/bin:
```bash
cd parse_json_xml/bin
```

Run application to parse JSON file:

```bash
java -jar menu-all.jar menu.json desc
```
Run application to parse xml file:

```bash
java -jar menu-all.jar menu.xml asc
```

By default data sorted in ascending order. 

## Important note 
The actual name of jar file is “menu-all” since I use Gradle and I want to include all the dependencies. I used “external” Json.org API.  

