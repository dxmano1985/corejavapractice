class SwitchCaseSample{

private int getSortOrder(String firstName, final String lastName) {

String middleName = "Patricia";
final String suffix = "JR";
int id = 0;

switch(firstName) {
	case "Test":
	return 52;

	case middleName: // DOES NOT COMPILE   not a final constant
	id = 5;
	break;

case suffix:
id = 0;
break;
case lastName: // DOES NOT COMPILE  - final constant Value should be assigned on same line
id = 8;
break;
case 5: // DOES NOT COMPILE int
id = 7;
break;
case 'J': // DOES NOT COMPILE  single quotes. so char datatype.
id = 10;
break;
case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE   enum datatype
id=15;
break;
}
return id;
}


}