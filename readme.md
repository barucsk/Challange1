Copiamos los siguientes archivos de la parpeta CLIPSJNI:
  CLIPSJNI.jar
  CLIPSJNI.dll
  net/ (El directorio lo encontramos dentro de java-source/)
  
Pegamos en la carpeta jade/src/jade/
  CLIPSJNI.jar
  net/
  
  Pegamos en C:/windows/
    CLIPSJNI.dll

Ok we create 2 files. The first demo.java you can check the source code on src/
1.Compile the file:
	javac -cp lib/CLIPSJNI.jar src/demo.java -d classes/
2.Execute the file:
	java -cp lib/CLIPSJNI.jar;classes examples.clips.demo

Now lets compile another file, but in this case we are going to call
clips throuth a file
1.Compile the file:
	javac -cp lib/CLIPSJNI.jar src/persons.java -d classes/
2.Executethe file:
	java -cp lib/CLIPSJNI.jar;classes examples.clips.persons
