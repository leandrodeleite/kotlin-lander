# kotlin-lander

# Kotlin Programming Language
https://kotlinlang.org

---

# Full Kotlin Reference
https://kotlinlang.org/docs/kotlin-docs.pdf


# Kotlin Docs/Reference
https://kotlinlang.org/docs/reference/


---

# Try Kotlin
https://try.kotlinlang.org


    ## Hello, world!

    - hello.kt

    - helloSimplestVersion.kt   ->  Optional package header and package-level function 'main'

    - helloNameReading.kt       ->  Reading a name from the command line

    - helloManyNamesReading.kt  ->  Reading many names from the command line

    - helloMultiLanguage.kt     ->  A Multi-language Hello

    - helloObjectOriented.kt    ->  An Object-oriented hello

---

## Getting Started with Kotlin in 2 minutes
https://www.youtube.com/watch?v=viiDaLpPfN4

    - getstartedCities.kt       ->  listOf(), Pair(), for(), interpolation

    - getstartedNumbers.kt      ->  arrayListOf(), .filter, interpolation

    - getstartedCustomer.kt     ->  class, data class

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

---

## Kotlin Compiler

    Compile applications
    
    $ kotlinc <file>.kt -include-runtime -d <file>.jar
    
    $ java -jar <file>.jar
    
    Note:
    - -d option indicates output name and may be either a directory name for a class or a .jar file name.
    - -include-runtime option makes the resulting .jar file self-contained and runnable
      by the Kotlin runtime library in it.

    
    Compile libraries
    
    $ kotlinc <file>.kt -d <file>.jar
    
    $ kotlin  -classpath <file>.jar <File>Kt
   
    Note:
    - If you are developing a library to be used by other Kotlin applications,
      you can produce the .jar file without including the Kotlin into it
    - Since binaries compiled this way depend on the Kotlin runtime you should make sure
      the latter is present in the classpath whenever your compiled library is used
    - You can also use the 'kotlin' script to run binaries produced by the Kotlin compiler
    - <File>Kt is the main class name that the Kotlin compiler generates for the file named <file>.kt
    

    
    Compiler Options
    
    $ kotlin -help
    



# Publications

---
## Kotlin Programming - Next Level Java Development
by Peter Sommerhoff
Udemy - www.udemy.com/kotlin-course/

3.5 hours

---
## Kotlin for Java Developers
by Dmitri Nesteruk
Udemy - www.udemy.com/kotlin-java/

3.0 hours

---

