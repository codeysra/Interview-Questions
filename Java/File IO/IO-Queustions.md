# IO Interview Questions


## Overview Questions

### What is an IO stream?

It is a flow of data that we can read from or write to.

### What are types of IO streams?

- Character streams
- Byte streams

### What are classes available for the different stream?

- For Character streams: java.io.Reader and java.io.Writer
    
- For Byte streams: java.io.InputStream and java.io.OutputStream


## Writers Questions

### Waht are the different writers available for Character streams?
    1- FileWriter
    2- BufferedWriter
    3- PrintWriter
    
### Whats the difference between FileWriter and BufferedWriter?

BufferedWriter cannot communicate with File directly. We have to use a writer with it.

### ... And PrintWriter?

PrintWriter can communicate directly to file and also via a writer.

### Why we have to use flush and close?

flush() is used to clear all the data charactrs stored in the buffer and clear the buffer.
It flushes the stream (thus we are certain that the data has properly written to the file).

close() is used to close the character stream and releases the system resources associated with
the strea,

** flush() is applicable for all the writers.
   close() is applicable for both the writers and readers.

   
