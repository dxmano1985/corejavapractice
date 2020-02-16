/*
* import same name class from 2 different packages
* 

Case 1 : 
import java.sql.Date;
import java.util.Date;

* ImportPackages.java:6: error: a type with the same simple name is already defined by the single-type-import of Date


Case 2:
import java.util.*;
import java.sql.Date;

* Case 2 compiles successfully


Case 3:

import java.util.*;
import java.sql.*;

* Case 3: ImportPackages.java:34: error: reference to Date is ambiguous

*/

import java.util.*;
import java.sql.Date;

class ImportPackages{


public static void main(String[] args){

Date date = new Date(2015,04,05);
}

}