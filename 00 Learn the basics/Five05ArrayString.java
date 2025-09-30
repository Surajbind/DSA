//In Java, Array's are collection of elements of the same data type and is stored at contigouos memory location;
//they are fixed in size and accessed using indices;
//Each element is identified by an index, which start at 0;

// Declare an array of integers with a length of 3
int[] myArr = new int[3];

// Assign values to the elements of the array
myArr[0] = 45;
myArr[1]=78;
myArr[2] = 90;


// Declare and initialize an array of integers in one line
int[] myArs = {45,78,90};

// Access the elements of an array using the square brackets operator
int firstElement = myArs[0];
int lastElement = myArs[myArs.length-1];



//String

//String are sequence of character used for text;
/* They Are Immutable meaning Once created they can not be changed, Although we can manipulate,  
String via various methods. */


// Declare and initialize a string variable
// Declare and initialize a string variable in one line
String myStr = "HELLO SURAJ";

// Get the length of the string
int lengthStr = myStr.length();

// Access individual characters of the string using the charAt method
char A = myStr.charAt[0];

char B = myStr.charAt[lengthStr-1];

