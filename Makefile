all: Simulator.class

Simulator.class : Enums.java Initialize.java Instruction.java Operand.java Register.java Simulator.java
	javac *.java

clean:
	rm -f *.class
