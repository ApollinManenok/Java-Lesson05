if not exist bin\nul md bin
javac -d bin -sourcepath src -cp bin src\by\itacademy\lesson05\task2\Task2.java
java -classpath bin by.itacademy.lesson05.task2.Task2