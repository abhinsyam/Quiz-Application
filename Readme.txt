# Quiz Application is a MCQ Application. User can store Question, corresponding 4 MCQ options, right answer to the question, difficulty level and category to the database. 

# Based on category like JAVA, PYHTON - PRE INPUTED, WE Can filter questions and quiz can be done. 

# User is given options to add / remove questions based on ID. 

# QuestionController class Controls updating database, adding, deleting updating questions.

# QuizController class controls displaying questions based on category, submitting result, comparing the submitted answer with database right answer and providing score.

# Based on number of right answer inputed result score at end of quiz also given. 

# Following GET & POST request shows the output accordingly. To filter out JAVA, table is created using SQL database and given id as 1 and for Pyhton id set to 2. 



#1  Output of GET Request --> http://localhost:8080/question/allQuestions 


[
    {
        "id": 1,
        "questionTitle": "Number of primitive data types in Java are?",
        "option1": "6",
        "option2": "7",
        "option3": "8",
        "option4": "9",
        "rightAnswer": "8",
        "difficultylevel": "EASY",
        "category": "JAVA"
    },
    {
        "id": 2,
        "questionTitle": "What is the size of float and double in java?",
        "option1": "32 and 32",
        "option2": "32 and 64",
        "option3": "64 and 64",
        "option4": "64 and 32",
        "rightAnswer": "32 and 64",
        "difficultylevel": "MEDIUM",
        "category": "JAVA"
    },
    {
        "id": 3,
        "questionTitle": "Automatic type conversion is possible in which of the possible cases?",
        "option1": "Byte to int",
        "option2": "Int to long",
        "option3": "Long to int",
        "option4": "Short to int",
        "rightAnswer": "Int to long",
        "difficultylevel": "EASY",
        "category": "JAVA"
    },
    {
        "id": 4,
        "questionTitle": "When an array is passed to a method, what does the method receive?",
        "option1": "The reference of the array",
        "option2": "A copy of the array",
        "option3": "Length of the array",
        "option4": "Copy of first element",
        "rightAnswer": "The reference of the array",
        "difficultylevel": "HARD",
        "category": "JAVA"
    },
    {
        "id": 5,
        "questionTitle": "What is the maximum possible length of an identifier?",
        "option1": "16",
        "option2": "32",
        "option3": "64",
        "option4": "None of the above",
        "rightAnswer": "None of the above",
        "difficultylevel": "EASY",
        "category": "PYTHON"
    },
    {
        "id": 6,
        "questionTitle": "Who developed the Python language?",
        "option1": "Zim Den",
        "option2": "Guido van Rossum",
        "option3": "Niene Stom",
        "option4": "Wick van Rossum",
        "rightAnswer": "Guido van Rossum",
        "difficultylevel": "MEDIUM",
        "category": "PYTHON"
    },
    {
        "id": 7,
        "questionTitle": "In which year was the Python language developed?",
        "option1": "1995",
        "option2": "1972",
        "option3": "1981",
        "option4": "1989",
        "rightAnswer": "1989",
        "difficultylevel": "EASY",
        "category": "PYTHON"
    }
]



#2 Output of GET Request --> http://localhost:8080/question/category/JAVA


[
    {
        "id": 1,
        "questionTitle": "Number of primitive data types in Java are?",
        "option1": "6",
        "option2": "7",
        "option3": "8",
        "option4": "9",
        "rightAnswer": "8",
        "difficultylevel": "EASY",
        "category": "JAVA"
    },
    {
        "id": 2,
        "questionTitle": "What is the size of float and double in java?",
        "option1": "32 and 32",
        "option2": "32 and 64",
        "option3": "64 and 64",
        "option4": "64 and 32",
        "rightAnswer": "32 and 64",
        "difficultylevel": "MEDIUM",
        "category": "JAVA"
    },
    {
        "id": 3,
        "questionTitle": "Automatic type conversion is possible in which of the possible cases?",
        "option1": "Byte to int",
        "option2": "Int to long",
        "option3": "Long to int",
        "option4": "Short to int",
        "rightAnswer": "Int to long",
        "difficultylevel": "EASY",
        "category": "JAVA"
    },
    {
        "id": 4,
        "questionTitle": "When an array is passed to a method, what does the method receive?",
        "option1": "The reference of the array",
        "option2": "A copy of the array",
        "option3": "Length of the array",
        "option4": "Copy of first element",
        "rightAnswer": "The reference of the array",
        "difficultylevel": "HARD",
        "category": "JAVA"
    }
]


#3 Filtering out Python Questions : http://localhost:8080/quiz/get/2


[
    {
        "id": 5,
        "questionTitle": "What is the maximum possible length of an identifier?",
        "option1": "16",
        "option2": "32",
        "option3": "64",
        "option4": "None of the above"
    },
    {
        "id": 7,
        "questionTitle": "In which year was the Python language developed?",
        "option1": "1995",
        "option2": "1972",
        "option3": "1981",
        "option4": "1989"
    },
    {
        "id": 6,
        "questionTitle": "Who developed the Python language?",
        "option1": "Zim Den",
        "option2": "Guido van Rossum",
        "option3": "Niene Stom",
        "option4": "Wick van Rossum"
    }
]




#4  --> Filtering out JAVA Questions : http://localhost:8080/quiz/get/1


[
    {
        "id": 1,
        "questionTitle": "Number of primitive data types in Java are?",
        "option1": "6",
        "option2": "7",
        "option3": "8",
        "option4": "9"
    },
    {
        "id": 3,
        "questionTitle": "Automatic type conversion is possible in which of the possible cases?",
        "option1": "Byte to int",
        "option2": "Int to long",
        "option3": "Long to int",
        "option4": "Short to int"
    },
    {
        "id": 2,
        "questionTitle": "What is the size of float and double in java?",
        "option1": "32 and 32",
        "option2": "32 and 64",
        "option3": "64 and 64",
        "option4": "64 and 32"
    },
    {
        "id": 4,
        "questionTitle": "When an array is passed to a method, what does the method receive?",
        "option1": "The reference of the array",
        "option2": "A copy of the array",
        "option3": "Length of the array",
        "option4": "Copy of first element"
    }
]


