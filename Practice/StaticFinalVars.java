/*
* Study about static variables and final variables
* final instance varible must be initial
*/
class StaticFinalVars{
int var1;
static int var2;
final int var3;
static final int var4;
StaticFinalVars(){
var3 = 3;
//var4 = 4; // compile error. StaticFinalVars.java:13: error: cannot assign a value to final variable var4
//var3 = 3+1; // compile error. StaticFinalVars.java:15: error: variable var3 might already have been assigned
}
{
var3 = 9;
}
static{
var4 = 4;
}


}