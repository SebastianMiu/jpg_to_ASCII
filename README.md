# .jpg_to_ASCII
A java .jpg-to-ASCII art converter

ASCII art is a graphic design technique that uses computers for presentation and consists of pictures pieced together from the characters defined by the ASCII Standard.

It is created by assigning a character to each pixel of the image by brightness.

# EXAMPLE

![input](https://github.com/user-attachments/assets/e6bd6ce1-7f68-48d9-8677-3e740d9ff190)


input image

![output example](https://github.com/user-attachments/assets/fdf4e0c8-a605-46d7-96b6-72edb526500d)


output ASCII art displayed in a html file


# How to use

- ### In Main.java, insert your file path for the input.jpg file as shown (line 15):

      File img = new File("YOUR\\PATH\\HERE\\input.jpg");

- ### Open CMD and compile the updated Main.java:

      javac Main.java

- ### Run the program:

      java Main

- ### Open another CMD window and run a python http server:

      python -m http.server 8000


- ### open http://localhost:8000/index.html in your browser and the ASCII Art should be displayed
  




