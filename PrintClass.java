public class PrintClass // Here we declare the PrintClass class.
{ // Then use an opening bracket to put code after.
  private String name; // Here we declare a string called "name".
	public void setName(String setName) /* Here we set the private function setName, which
	can only be used inside of this file. */
	{
		name = setName; // Then name is set to setName which is gotten from the main class.
	} /* This is a bracket to close the close the function or class, in this case it's
	closing the setName function. */
	public String getName() /* Here we declare the public function "getName", which will be
	used to get the name from the private function. */
	{
		return name; /* Here we return the name, but don't print it out to the user. Usually
		a third function is made to print out the name, but in this a different method is
		used inside of the mainClass file to print it out. */
	}
}
