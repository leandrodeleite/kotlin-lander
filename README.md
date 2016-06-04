# kotlin-lander

# Kotlin Programming Language
https://kotlinlang.org

---

# Try Kotlin
https://try.kotlinlang.org


    ## Hello, world!

    - helloSimplestVersion.kt

    - helloNameReading.kt       ->  Reading a name from the command line

    - helloManyNamesReading.kt  ->  Reading many names from the command line

    - helloMultiLanguage.kt     ->  A Multi-language Hello

    - helloObjectOriented.kt    ->  An Object-oriented hello

---

# Working with the Command Line Compiler
htts://kotlinlang.org/docs/tutorials/command-line.html

## Kotlin Interactive Shell/REPL

    Welcome to Kotlin version X... (JRE X...)
    Type :help for help, :quit for quit
    >>>

    >>> :help
    Available commands:
    :help                   show this help
    :quit                   exit the interpreter
    :dump bytecode          dump classes to terminal
    :load <file>            load script from specified file

    Note:
    - Run the compiler without parameters to have an interactive shell
    - Type any valid Kotlin code

## Kotlin as a Scripting Language

    $ kotlinc -script <file.kts> <arg>

    Note:
    - A script is a Kotlin source file '.kts' with top level executable code
    - To run a script, pass the '-script' option to the compiler with the corresponding script file
              -script     evaluate the script file

---

# Scripts

    - scriptListFolders.kts     ->  List folders from a <path> from the command line


