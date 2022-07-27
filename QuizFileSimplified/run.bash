#/bin/bash
javac src/com/Quiz/Main.java -sourcepath src -d build/classes
[ $? -eq 0 ] && java -cp build/classes com.Quiz.Main

