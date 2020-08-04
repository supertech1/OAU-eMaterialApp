package com.example.supertech.csc201real;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Practice_List_Fragment extends Fragment implements AdapterView.OnItemClickListener{

    ListView practice_list_view;
    HomePage homePage = new HomePage(); //get reference to method to read from raw


    public Practice_List_Fragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_practice__list_, container, false);

        String list_array[] = {"01 : Data Types, Variables and Arrays.",
                "02 : Operators & Control Statements",
                "03 : Classes and Methods",
                "04 : Inheritance & String Handling",
                "05 : Packages and Interfaces",
                "06 : Serialization & Deserialization",
                "07 : Networking",
                "08 : Collections",
                "09 : Exception Handling",
                "10 : Multithreading",
                "11 : I / O",
                "12 : Applets",
                "13 : Event Handling",
                "14 : Java.lang Package",
                "15 : Collection Framework",

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.list_layout_for_practice_list,list_array);

        practice_list_view = (ListView)v.findViewById(R.id.practice_list_view);
        practice_list_view.setAdapter(adapter);
        practice_list_view.setOnItemClickListener(this);
        return v;

    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Practice_Solution_Fragment practice_solution_fragment = new Practice_Solution_Fragment();

        String title = (String)parent.getItemAtPosition(position);  //get title

        if(position == 0)    //for  Data Types, Variables and Arrays
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.aq1)),   //qst1
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.aq50))

            };  //row0



            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.as1)),     //qst solution
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.as50))


            };  //row0




            //each qst represent a row...the options comprises the row along side with an integer representing the current answer
            String[][] qst_options = {  {"-128 to 127","-32768 to 32767","-2147483648 to 2147483647","None of the mentioned","B"}, //1 //the last option is the ans...and it is the array index  //row_qst 0 options and ans
                    {"-128 to 127","-32768 to 32767","-2147483648 to 2147483647","None of the mentioned","A"}, //2
                    {"1 and 2","2 and 3","3 and 4","All statements are correct.","D"}, //3
                    {"int","long","byte","float","A"}, //4
                    {"1.7e-308","3.4e-038","1.7e+308","3.4e-050","B"}, //5
                    {"int","float","double","long","C"}, //6
                    {"16.34","16.566666644","16.46666666666667","16.46666666666666","C"}, //7
                    {"38 43","39 44","295 300","295.04 300","B"}, //8
                    {"25","24","32","33","C"}, //9
                    {"301.5656","301","301.56","301.56560000","A"}, //10
                    {"-128 to 127","0 to 256","0 to 32767","0 to 65535","D"}, //11
                    {"ASCII","ISO-LATIN-1","UNICODE","None of the mentioned","C"}, //12
                    {"True & False","0 & 1","Any integer value","true","D"}, //13
                    {"ASCII","ISO-LATIN-1","None of the mentioned","ASCII and ISO-LATIN1","D"}, //14
                    {"boolean b1 = 1;","boolean b2 = ‘false’;","boolean b3 = false;"," boolean b4 = ‘true’","C"}, //15
                    {"i i i i i","0 1 2 3 4","i j k l m","None of the mentioned","A"}, //16
                    {"66","67","65","64","A"}, //17
                    {"0","1","true","false","C"}, //18
                    {"0","1","true","false","D"}, //19
                    {"162","65 97","67 95","66 98","B"}, //20
                    {"0x99fffL","ABCDEFG","0x99fffa","99671246","A"}, //21
                    {"Integer","Boolean","Character","Integer or Boolean","D"}, //22
                    {"L","l","D","L and I","D"}, //23
                    {"integer","float","boolean","all of the mentioned","D"}, //24
                    {"identifier","keyword","identifier & keyword","None of the mentioned","B"}, //25
                    {"38","39","40","41","C"}, //26
                    {"0 2 4 6 8","1 2 3 4 5","0 1 2 3 4 5 6 7 8 9","1 2 3 4 5 6 7 8 9 10","B"}, //27
                    {"5 6 5 6","5 6 5","Runtime error","Compilation error","D"}, //28
                    {"\"Hello World\"","“Hello\\nWorld”","“\\”Hello World””","“Hello\n" +
                            "world”","D"}, //29
                    {"5.0","25.0","7.0","Compilation Error","A"}, //30
                    {"The destination type is smaller than source type.","The destination type is larger than source type.","The destination type can be larger or smaller than source type.","None of the mentioned","B"}, //31
                    {"prototype( )","prototype(void)","public prototype(void)","public prototype( )","D"}, //32
                    {"b can not contain value 100, limited by its range.","* operator has converted b * 50 into int, which can not be converted to byte without casting.","b can not contain value 50.","No error in this code","B"}, //33
                    {"long","int","double","float","C"}, //34
                    {"Floating-point value assigned to an integer type.","Integer value assigned to floating type.","Floating-point value assigned to an Floating type.","Integer value assigned to floating type.","A"}, //35
                    {"E U","U E","V E","U F","A"}, //36
                    {"38 43","39 44","295 300","295.04 300","B"}, //37
                    {"b is : 2","b is : 1","Compilation Error.","An exception is thrown at runtime.","C"}, //38
                    {"1 1","1 0","1 0 3","1 2 3","D"}, //39
                    {"Hello c","Hello","Hello world","Runtime Error.","D"}, //40
                    {"malloc","alloc","new","new malloc","C"}, //41
                    {"int arr[] = new int[5]","int [] arr = new int[5] ","int arr[] arr = new int[5] ","int arr[] = int [5] new","D"}, //42
                    {"0","value stored in arr[0].","00000","Garbage value","D"}, //43
                    {"It is necessary to use new operator to initialize an array.","Array can be initialized using comma separated expressions surrounded by curly braces.","Array can be initialized when they are declared.","None of the mentioned","A"}, //44
                    {"Row","Column","Both Row and Column","None of the mentioned","A"}, //45
                    {"0 2 4 6 8","1 3 5 7 9","0 1 2 3 4 5 6 7 8 9","1 2 3 4 5 6 7 8 9 10","A"}, //46
                    {"11","10","13","14","B"}, //47
                    {"3","0","6","1","D"}, //48
                    {"1 2 3 4 5 6 7 8 9 10","0 1 2 3 4 5 6 7 8 9 10","i j k l m n o p q r","i i i i i i i i i i","D"}, //49
                    {"8","9","10","11","B"} //50

            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }






        if(position == 1)  //for Operators & Control Statements
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.bq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bq50))


            };  //row0




            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.bs1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.bs50))


            };  //row0



            String[][] qst_options = {{"Numeric", "Boolean", "Characters", "Both Numeric & Characters", "D"}, //1  //row_qst 0 options and ans
                    {"Integers","Floating – point numbers","Both Integers and floating – point numbers.","None of the mentioned","C"}, //2
                    {"1, 2 & 3","1 & 4","1, 2, 3 & 4","3 & 2","C"}, //3
                    {"1","2","3","4","A"}, //4
                    {"Assignment operators are more efficiently implemented by Java run-time system than their equivalent long forms.","Assignment operators run faster than their equivalent long forms.","Assignment operators can be used only with numeric and character data type.","None","D"}, //2
                    {"1 1","0 1","1.5 1","1.5 1.0","C"}, //6
                    {"5.640000000000001 5","5.640000000000001 5.0","5 5","5 5.640000000000001","A"}, //7
                    {"25","24","32","33","C"}, //8
                    {"11 11","10 10","11 10","10 11","C"}, //9
                    {"3 2 4","3 2 3","2 3 4","3 4 4","D"}, //10
                    {"&","&=","|=","<=","D"}, //11
                    {"~","<<<",">>>","^","A"}, //12
                    {"1","32","33","31","D"}, //13
                    {"<<",">>","<<=",">>=","B"}, //14
                    {"The left shift operator, <<, shifts all of the bite in a value to the left specified number of times.","The right shift operator, >>, shifts all of the bite in a value to the right specified number of times.","The left shift operator can be used as an alternative to multiplying by 2.","The right shift operator automatically fills the higher order bits with 0.","D"}, //15
                    {"42 42","43 43","42 -43","42 43","C"}, //16
                    {"7 2","7 7","7 5","5 2","A"}, //17
                    {"0 64","64 0","0 256","256 0","D"}, //18
                    {"10","5","2","20","B"}, //19
                    {"3 1 6","2 2 3","2 3 4","3 3 6","A"}, //20
                    {"Integer","Boolean","Characters","Double","B"}, //21
                    {"Integers","Floating - point numbers","Boolean","None of the mentioned","C"}, //22
                    {"3 & 2","1 & 4","1, 2 & 4","1, 2 & 3","D"}, //23
                    {"!","|","&","&&","D"}, //24
                    {"true and false are numeric values 1 and 0."," true and false are numeric values 0 and 1.","true is any non zero value and false is 0.","true and false are non numeric values.","D"}, //25
                    {"1","0","true"," false","D"}, //26
                    {"false false","true ture","true false","false true","D"}, //27
                    {"0","1","3","-4","C"}, //28
                    {"1","2","Runtime error owing to division by zero in if condition.","Unpredictable behavior of program.","B"}, //29
                    {"0","1","false","true","C"}, //30
                    {"()","++","*",">>","A"}, //31
                    {"Integer","Floating – point numbers","Boolean","None of the mentioned","C"}, //32
                    {"0","1","9","8","D"}, //33
                    {"1 -> 2 -> 3","2 -> 1 -> 3","3 -> 2 -> 1","2 -> 3 -> 1","A"}, //34
                    {"Equal to operator has least precedence.","Brackets () have highest precedence.","Division operator, /, has higher precedence than multiplication operator.","Addition operator, +, and subtraction operator have equal precedence.","C"}, //35
                    {"10","11","12","56","C"}, //36
                    {"24 8","24 9","27 8","27 9","D"}, //37
                    {"0","1","3","-4","C"}, //38
                    {"1 will give better performance as it has no parentheses.","2 will give better performance as it has parentheses.","Both 1 & 2 will give equal performance.","Dependent on the computer system.","C"}, //39
                    {"1","2","Runtime error owing to division by zero in if condition.","Unpredictable behavior of program.","B"}, //40
                    {"if","switch","if & switch","None of the mentioned","B"}, //41
                    {"if()","for()","continue","break","A"}, //42
                    {"do-while","while","for","None of the mentioned","A"}, //43
                    {"break","return","exit","continue","D"}, //44
                    {"switch statement is more efficient than a set of nested ifs.","two case constants in the same switch can have identical values.","switch statement can only test for equality, whereas if statement can evaluate any type of boolean expression.","it is possible to create a nested switch statements.","B"}, //45
                    {"1","2","3","4","B"}, //46
                    {"5","6","14","compilation error","B"}, //47
                    {"1 3 5 7","2 4 6 8","1 3 5 7 9","1 2 3 4 5 6 7 8 9","C"}, //48
                    {"1","2","Runtime error owing to division by zero in if condition.","Unpredictable behavior of program.","B"}, //49
                    {"5 10","10 5","5","10","D"}  //50


            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }





        if(position == 2)   //for Classes and Methods
        {


            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.cq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cq70))



            };  //row0




            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.cs1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.cs70))


            };  //row0




            String[][] qst_options = {{"Memory address of allocated memory of object.", "NULL", "Any arbitrary pointer", "Garbage", "B"},  //1  //row_qst 0 options and ans

                    {"class", "struct", "int", "None of the mentioned", "A"},  //2
                    {"Box obj = new Box();", "Box obj = new Box;", "obj = new Box();", "new Box obj;", "A"},  //3
                    {"malloc", "alloc", "new", "give", "C"},  //4
                    {"Every class must contain a main() method.", "Applets do not require a main() method at all.", "There can be only one main() method in a program.", "main() method must be made public.", "A"},  //5
                    {"9", "8", "Compilation error", "Runtime error", "C"},  //6
                    {"Public method is accessible to all other classes in the hierarchy", "Public method is accessible only to subclasses of its parent class", "Public method can only be called by object of its class.", "Public method can be accessed by calling object of the public class.", "A"},  //7
                    {"12", "200", "400", "100", "B"},  //8
                    {"1", "2", "Runtime error", "Garbage value", "A"},  //9
                    {"0", "1", "Runtime error", "Garbage value", "D"},  //10
                    {"int", "float", "void", "double", "C"},  //11
                    {"Function overriding", "Function overloading", "Function doubling", "None of the mentioned", "B"},  //12
                    {"finalize", "delete", "class", "constructor", "D"},  //13
                    {"main method", "finalize method", "static method", "private method", "A"},  //14
                    {"All object of a class are allotted memory for the all the variables defined in the class.", "If a function is defined public it can be accessed by object of other class by inheritation.", "main() method must be made public.", "All object of a class are allotted memory for the methods defined in the class.", "D"},  //15
                    {"0", "1", "6", "25", "C"},  //16
                    {"false", "true", "0", "1", "B"},  //17
                    {"0", "1", "25", "26", "C"},  //18
                    {"1", "2", "Runtime Error", "Compilation Error", "D"},  //19
                    {"0", "1", "30", "error", "D"},  //20
                    {"int", "float", "void", "None of the mentioned", "D"},  //21
                    {"import", "catch", "abstract", "this", "D"},  //22
                    {"finalize", "delete", "class", "constructor", "D"},  //23
                    {"delete", "free", "new", "None of the mentioned", "D"},  //24
                    {"finalize()", "delete()", "main()", "None of the mentioned", "A"},  //25
                    {"100", "150", "200", "250", "B"},  //26
                    {"false", "true", "0", "1", "B"},  //27
                    {"150", "200", "Runtime error", "Compilation error", "A"},  //28
                    {"Default constructor is called at the time of declaration of the object if a constructor has not been defined.", "Constructor can be parameterized.", "finalize() method is called when a object goes out of scope and is no longer needed.", "finalize() method must be declared protected.", "C"},  //29
                    {"0 0", "5 6", "6 5", "5 5", "C"},  //30
                    {"method overloading", "method overriding", "method hiding", "None of the mentioned", "A"},  //31
                    {"Methods", "Constructors", "All of the mentioned", "None of the mentioned", "C"},  //32
                    {"Copy of argument is made into the formal parameter of the subroutine.", "Reference to original argument is passed to formal parameter of the subroutine.", "Copy of argument is made into the formal parameter of the subroutine and changes made on parameters of subroutine have effect on original argument.", "Reference to original argument is passed to formal parameter of the subroutine and changes made on parameters of subroutine have effect on original argument.", "A"},  //33
                    {"Polymorphism", "Abstraction", "Encapsulation", "Recursion", "D"},  //34
                    {"Default constructor is called at the time of declaration of the object if a constructor has not been defined.", "Constructor can be parameterized.", "finalize() method is called when a object goes out of scope and is no longer needed.", "finalize() method must be declared protected.", "C"},  //35
                    {"5", "6", "7", "8", "C"},  //36
                    {"6", "7", "8", "9", "C"},  //37
                    {"6 6", "6.4 6.4", "6.4 6", "4 6.4", "D"},  //38
                    {"10 20", "20 10", "20 40", "40 20", "A"},  //39
                    {"10 20", "20 10", "20 40", "40 20", "B"},  //40
                    {"private", "public", "protected", "None of the mentioned", "B"},  //41
                    {"public", "private", "static", "protected", "C"},  //42
                    {"private", "public", "public, within its own package", "protected", "A"},  //43
                    {"Polymorphism", "Abstraction", "Encapsulation", "Recursion", "C"},  //44
                    {"public members of class can be accessed by any code in the program.", "private members of class can only be accessed by other members of the class.", "private members of class can be inherited by a sub class, and become protected members in sub class.", "protected members of a class can be inherited by a sub class, and become private members of the sub class.", "C"},  //45
                    {"3 3", "2 3", "Runtime Error", "Compilation Error", "C"},  //46
                    {"2 3", "3 3", "Runtime Error", "Compilation Error", "B"},  //47
                    {"7 7", "6 6", "7 9", "9 7", "C"},  //48
                    {"public", "private", "protected", "None of the mentioned", "A"},  //49
                    {"10 20", "20 10", "20 40", "40 20", "B"},  //50
                    {"class", "object", "variable", "None of the mentioned", "B"},  //51
                    {"final", "last", "constant", "static", "A"},  //52
                    {"class", "object", "variable", "method", "B"},  //53
                    {"static methods can call other static methods only.", "static methods must only access static data.", "static methods can not refer to this or super in any way.", "when object of class is declared, each object contains its own copy of static variables.", "D"},  //54
                    {"Variables declared as final occupy memory.", "final variable must be initialized at the time of declaration.", "Arrays in java are implemented as an object.", "All arrays contain an attribute-length which contains the number of elements stored in the array.", "A"},  //55
                    {"main()", "delete()", "run()", "finalize()", "A"},  //56
                    {"1 2", "1 1", "2 2", "Compilation Error", "C"},  //57
                    {"7 7", "6 6", "7 9", "9 7", "C"},  //58
                    {"1 2", "1 2 3", "1 2 3 4", "1 2 3 4 5", "B"},  //59
                    {"10 5", "5 10", "0 10", "0 5", "A"},  //60
                    {"class", "object", "variable", "character array", "A"},  //61
                    {"char()", "Charat()", "charat()", "charAt()", "D"},  //62
                    {"upper", "super", "this", "None of the mentioned", "B"},  //63
                    {"isequal()", "isequals()", "equal()", "equals()", "D"},  //64
                    {"String is a class.", "Strings in java are mutable.", "Every string is an object of class String.", "Java defines a peer class of String, called StringBuffer, which allows string to be altered.", "B"},  //65
                    {"I", "like", "Java", "IlikeJava", "D"},  //66
                    {"I", "L", "K", "E", "A"},  //67
                    {"9", "10", "11", "12", "C"},  //68
                    {"hello hello", "world world", "hello world", "world hello", "C"},  //69
                    {"false false", "true true", "true false", "false true", "D"}  //70


            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }

        if(position == 3)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.dq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq70)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq71)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq72)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq77)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq74)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq75)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq76)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq77)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq78)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq79)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq80)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq81)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq82)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq83)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq84)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq85)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq86)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq87)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq88)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq89)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.dq90))





            };  //row0



            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.ds1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds70)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds71)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds72)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds73)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds74)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds75)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds76)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds77)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds78)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds79)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds80)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds81)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds82)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds83)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds84)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds85)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds86)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds87)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds88)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds89)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ds90))





            };  //row0

            String[][] qst_options = {{"super", "this", "extent", "extends", "D"}, //1  //row_qst 0 options and ans
                    {"upper", "super", "this", "None of the mentioned", "B"}, //2
                    {"public member", "private member", "protected member", "static member", "B"}, //3
                    {"class B + class A {}", "class B inherits class A {}", "class B extends A {}", "class B extends class A {}", "C"}, //4
                    {"public members of class can be accessed by any code in the program.", "private members of class can only be accessed by other members of the class.", "private members of class can be inherited by a sub class, and become protected members in sub class.", "protected members of a class can be inherited by a sub class, and become private members of the sub class.", "C"}, //5
                    {"0", "1", "2", "Compilation Error", "C"}, //6
                    {"2 2", "3 3", "2 3", "3 2", "C"}, //7
                    {"2 2", "3 3", "Runtime Error", "Compilation Error", "D"}, //8
                    {"1 2", "2 1", "Runtime Error", "Compilation Error", "A"}, //9
                    {"1 2", "2 1", "1 3", "3 1", "A"}, //10
                    {"super", "this", "extent", "extends", "A"}, //11
                    {"Method overloading", "Method overriding", "Method hiding", "None of the mentioned", "B"}, //12
                    {"static", "constant", "protected", "final", "D"}, //13
                    {"super(void);", "superclass.();", "super.A();", "super();", "D"}, //14
                    {"public members of class can be accessed by any code in the program.", "private members of class can only be accessed by other members of the class.", "private members of class can be inherited by a sub class, and become protected members in sub class.", "protected members of a class can be inherited by a sub class, and become private members of the sub class.", "C"}, //15
                    {"Abstraction", "Encapsulation", "Polymorphism", "None of the mentioned", "C"}, //16
                    {"0", "1", "2", "Compilation Error", "C"}, //17
                    {"2 2", "3 3", "Runtime Error", "Compilation Error", "D"}, //18
                    {"2 2", "3 3", "Runtime Error", "Compilation Error", "D"}, //19
                    {"1", "2", "3", "4", "B"}, //20
                    {"String class", "Object class", "Abstract class", "ArrayList class", "B"}, //21
                    {"Objectcopy()", "copy()", "Object clone()", "clone()", "C"}, //22
                    {"get()", "void getclass()", "Class getclass()", "None of the mentioned", "C"}, //23
                    {"super", "constant", "Class", "final", "D"}, //24
                    {"abstract", "extends", "abstract and extends", "None of the mentioned", "A"}, //25
                    {"Object class", "abstract class", "ArrayList class", "None of the mentioned", "B"}, //26
                    {"0", "2", "Runtime Error", "Compilation Error", "B"}, //27
                    {"false", "true", "1", "Compilation Error", "A"}, //28
                    {"Object", "class Object", "class java.lang.Object", "Compilation Error", "C"}, //29
                    {"true", "false", "String associated with obj1", "Compilation Error", "C"}, //30
                    {"java.util", "java.lang", "ArrayList", "None of the mentioned", "B"}, //31
                    {"+", "+=", "&", "||", "A"}, //32
                    {"get()", "Sizeof()", "lengthof()", "length()", "D"}, //33
                    {"CHARAT()", "chatat()", "charAt()", "ChatAt()", "C"}, //34
                    {"String()", "String(void)", "String(0)", "None of the mentioned", "A"}, //35
                    {"String objects are immutable, they cannot be changed.", "String object can point to some other reference of String variable.", "StringBuffer class is used to store string in a buffer for later use.", "None of the mentioned", "C"}, //36
                    {"a", "b", "c", "abc", "D"}, //37
                    {"ABC", "BCD", "CDA", "ABCD", "B"}, //38
                    {"3 0", "0 3", "3 4", "4 3", "D"}, //39
                    {"true", "false", "String associated with obj1", "Compilation Error", "C"}, //40
                    {"getchars()", "GetChars()", "Getchars()", "getChars()", "D"}, //41
                    {"getBytes()", "GetByte()", "giveByte()", "Give Bytes()", "A"}, //42
                    {"get()", "Sizeof()", "lengthof()", "length()", "D"}, //43
                    {"CHARAT()", "chatat()", "charAt()", "ChatAt()", "C"}, //44
                    {"charAt()", "getChars()", "toCharArray()", "All of the mentioned", "D"}, //45
                    {"Hello, i love java", "i love ja", "lo i lo", "llo i l", "D"}, //46
                    {"6 4 6 9", "5 4 5 9", "7 8 8 9", "4 3 6 9", "A"}, //47
                    {"a is a lower case Letter\n" +
                            "is White space character", "b is a lower case Letter\n" +
                            "is White space character", "a is a lower case Letter\n" +
                            "A is a upper case Letter", "a is a lower case Letter\n" +
                            "0 is a digit", "C"}, //48
                    {"a", "b", "c", "abc", "D"}, //49
                    {"h", "e", "l", "o", "B"}, //50
                    {"equals()", "Equals()", "isequal()", "Isequal()", "A"}, //51
                    {"regionMatch()", "match()", "RegionMatches()", "regionMatches()", "D"}, //52
                    {"startsWith()", "endsWith()", "Starts()", "ends()", "A"}, //53
                    {"zero", "value less than zero", "value greater than zero", "None of the mentioned", "B"}, //54
                    {"char", "int", "boolean", "All of the mentioned", "C"}, //55
                    {"true", "false", "0", "1", "B"}, //56
                    {"true true", "false false", "true false", "false true", "D"}, //57
                    {"true true", "false false", "true false", "false true", "C"}, //58
                    {"h", "e", "l", "o", "B"}, //59
                    {"ab", "bc", "ca", "ac", "D"}, //60
                    {"substring()", "Substring()", "SubString()", "None of the mentioned", "A"}, //61
                    {"one", "two", "onetwo", "twoone", "C"}, //62
                    {"startsWith()", "trim()", "Trim()", "doTrim()", "B"}, //63
                    {"zero", "value less than zero", "value greater than zero", "None of the mentioned", "B"}, //64
                    {"replace() method replaces all occurrences of one character in invoking string with another character.", "replace() method replaces only first occurances of a character in invoking string with another character.", "replace() method replaces all the characters in invoking string with another character.", "replace() replace() method replaces last occurrence of a character in invoking string with another character.", "A"}, //65
                    {"” Hello World ”", "” Hello World ”", "“Hello World”", "Hello world", "C"}, //66
                    {"one", "two", "one two", "compilation error", "C"}, //67
                    {"hello", "helwo", "hewlo", "hewwo", "D"}, //68
                    {"Hell", "Hello", "Worl", "World", "A"}, //69
                    {"4 8", "5 9", "4 9", "5 8", "C"}, //70
                    {"String()", "StringBuffer()", "Both of the mentioned", "None of the mentioned", "B"}, //71
                    {"concat()", "append()", "join()", "concatenate()", "B"}, //72
                    {"length()", "Length()", "capacity()", "Capacity()", "A"}, //73
                    {"Hell", "ello", "Hel", "llo", "B"}, //74
                    {"reverse() method reverses all characters.", "reverseall() method reverses all characters.", "replace() method replaces first occurrence of a character in invoking string with another character.", "replace() method replaces last occurrence of a character in invoking string with another character.", "A"}, //75
                    {"6 4 6 9", "5 4 5 9", "7 8 8 9", "4 3 6 9", "A"}, //76
                    {"He", "Hel", "lo", "llo", "D"}, //77
                    {"Hello", "World", "Helloworld", "Hello World", "D"}, //78
                    {"Hello", "olleH", "HelloolleH", "olleHHello", "B"}, //79
                    {"a is a lower case Letter\n" +
                            "is White space character", "b is a lower case Letter\n" +
                            "is White space character", "a is a lower case Letter\n" +
                            "A is a upper case Letter", "a is a lower case Letter\n" +
                            "0 is a digit", "C"}, //80
                    {"substring()", "Substring()", "SubString()", "None of the mentioned", "A"}, //81
                    {"one", "two", "onetwo", "twoone", "C"}, //82
                    {"reverse()", "reverseall()", "Reverse()", "reverseAll()", "A"}, //83
                    {"length()", "capacity()", "Length()", "Capacity()", "A"}, //84
                    {"StringBuffer()", "StringBuffer(int size)", "StringBuffer(String str)", "StringBuffer(int size , String str)", "D"}, //85
                    {"4", "5", "6", "7", "B"}, //86
                    {"Hello", "World", "Helloworld", "Hello World", "D"}, //87
                    {"xello", "xxxxx", "Hxllo", "Hexlo", "C"}, //88
                    {"HelloGoodWorld", "HellGoodoWorld", "HellGood oWorld", "Hello Good World", "D"}, //89
                    {"Hell", "ello", "Hllo", "Helo", "C"} //90


            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }





        if(position == 4)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.eq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq70)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq71)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq72)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq73)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq74)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq75)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq76)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq77)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq78)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq79)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq80)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq81)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq82)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq83)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq84)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq85)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq86)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq87)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq88)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq89)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.eq90))




            };  //row0



            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.es1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es70)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es71)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es72)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es73)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es74)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es75)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es76)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es77)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es78)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es79)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es80)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es81)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es82)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es83)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es84)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es85)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es86)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es87)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es88)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es89)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.es90))




            };  //row0



            String[][] qst_options = {{"pkg", "Pkg", "package", "Package", "C"}, //1   //row_qst 0 options and ans
                    {"Object", "Packages", "Interfaces", "None of the Mentioned.", "B"}, //2
                    {"Public", "Protected", "No Modifier", "All of the mentioned", "D"}, //3
                    {"Public", "Protected", "Private", "No Modifier", "A"}, //4
                    {"import pkg.", "Import pkg.", "import pkg.*", "Import pkg.*", "C"}, //5
                    {"Package defines a namespace in which classes are stored.", "A package can contain other package within it.", "Java uses file system directories to store packages.", "A package can be renamed without renaming the directory in which the classes are stored.", "D"}, //6
                    {"lang", "java", "util", "java.packages", "B"}, //7
                    {"0", "1", "2", "0 1 2", "C"}, //8
                    {"xello", "xxxxx", "Hxllo", "Hexlo", "C"}, //9
                    {"HelloGoodWorld", "HellGoodoWorld", "Compilation error", "Runtime error", "D"}, //10
                    {"interface", "Interface", "intf", "Intf", "A"}, //11
                    {"Objects", "Packages", "Interfaces", "None of the Mentioned.", "C"}, //12
                    {"Public", "Protected", "private", "All of the mentioned", "A"}, //13
                    {"import", "Import", "implements", "Implements", "C"}, //14
                    {"class manager extends salary {}", "class manager implements salary {}", "class manager imports salary {}", "None of the mentioned.", "B"}, //15
                    {"Interfaces specifies what class must do but not how it does.", "Interfaces are specified public if they are to be accessed by any code in the program.", "All variables in interface are implicitly final and static.", "All variables are static and methods are public if interface is defined pubic.", "D"}, //16
                    {"lang", "java", "util", "java.packages", "B"}, //17
                    {"0", "2", "4", "None of the mentioned", "C"}, //18
                    {"0 0", "2 2", "4 1", "1 4", "C"}, //19
                    {"0 1 2", "0 2 4", "0 0 4", "0 1 4", "C"}, //20
                    {"Byte", "Integer", "Array", "Class", "C"}, //21
                    {"type wrapping", "type conversion", "type casting", "None of the Mentioned.", "A"}, //22
                    {"Long", "Digits", "Float", "Number", "D"}, //23
                    {"float", "double", "Float", "Double", "C"}, //24
                    {"bytevalue()", "byte bytevalue()", "Bytevalue()", "Byte Bytevalue().", "B"}, //25
                    {"isInfinite()", "isNaN()", "Isinfinite()", "IsNaN()", "A"}, //26
                    {"lang", "java", "util", "java.packages", "A"}, //27
                    {"0", "1", "true", "false", "C"}, //28
                    {"0", "1", "true", "false", "D"}, //29
                    {"1001", "10011", "11011", "10001", "D"}, //30
                    {"Integer", "Long", "Byte", "Double", "A"}, //31
                    {"int hash()", "int hashcode()", "int hashCode()", "Integer hashcode()", "C"}, //32
                    {"Long", "Digits", "Float", "Number", "D"}, //33
                    {"Float", "Character", "String", "Integer", "B"}, //34
                    {"bytevalue()", "byte bytevalue()", "Bytevalue()", "Byte Bytevalue().", "B"}, //35
                    {"long value()", "long longValue()", "Long longvalue()", "Long Longvalue()", "B"}, //36
                    {"true false true", "false true true", "true true false", "false false false", "B"}, //37
                    {"0", "1", "256", "257", "B"}, //38
                    {"0", "1", "257", "257.0", "D"}, //39
                    {"256", "256.0", "256.00", "257.00", "A"}, //40
                    {"Void", "Process", "System", "Runtime", "A"}, //41
                    {"void kill()", "void destroy()", "void terminate()", "void exit()", "B"}, //42
                    {"Void", "Process", "Runtime", "System", "D"}, //43
                    {"Void", "Process", "Runtime", "System", "B"}, //44
                    {"currenttime()", "currentTime()", "currentTimeMillis()", "currenttimeMillis()", "C"}, //45
                    {"Void", "Process", "Runtime", "System", "D"}, //46
                    {"0", "1", "1000", "System Dependent", "D"}, //47
                    {"ABCDEF ABCDEF", "ABCDEF GHIJKL", "GHIJKL ABCDEF", "GHIJKL GHIJKL", "A"}, //48
                    {"ABCDEF GHIJKL", "ABCDEF GCDEFL", "GHIJKL ABCDEF", "GCDEFL GHIJKL", "B"}, //49
                    {"ABCDEF GHIJKL", "ABCDEF GCDEFL", "GHIJKL ABCDEF", "GCDEFL GHIJKL", "A"}, //50
                    {"Math", "Process", "System", "Object", "D"}, //51
                    {"clone()", "copy()", "dublicate()", "dito()", "A"}, //52
                    {"approximately 3", "approximately 3.14", "approximately 2.72", "approximately 0", "C"}, //53
                    {"max()", "min()", "abs()", "All of the mentioned", "D"}, //54
                    {"Math", "Process", "System", "Object", "A"}, //55
                    {"Class", "Object", "Runtime", "System", "A"}, //56
                    {"1 2 0 0", "1 2 1 2", "0 0 0 0", "System Dependent", "B"}, //57
                    {"0", "3", "3.0", "3.1", "B"}, //58
                    {"true", "flase", "3.1", "4.5", "D"}, //59
                    {"2.0", "4.0", "8.0", "9.0", "C"}, //60
                    {"java.util", "java.lang", "java.io", "All of the mentioned", "C"}, //61
                    {"String", "StringReader", "Writer", "File", "A"}, //62
                    {"DataInput", "ObjectInput", "ObjectFilter", "FileFilter", "C"}, //63
                    {"File", "Writer", "InputStream", "Reader", "A"}, //64
                    {"a file in disk", "directory path", "directory in disk", "None of the mentioned", "C"}, //65
                    {"IsFile()", "isFile()", "Isfile()", "isfile()", "B"}, //66
                    {"java", "system", "java/system", "/java/system", "B"}, //67
                    {"java", "system", "java/system", "/java/system", "D"}, //68
                    {"true false", "false true", "true true", "false false", "D"}, //69
                    {"java true", "java false", "\\java false", "\\java true", "C"}, //70
                    {"InputStream", "Reader", "Writer", "All of the mentioned", "A"}, //71
                    {"FileReader", "FileWriter", "FileInputStream", "InputStreamReader", "C"}, //72
                    {"read()", "scanf()", "get()", "getInteger()", "A"}, //73
                    {"int", "float", "byte", "None of the mentioned", "D"}, //74
                    {"clear()", "flush()", "fflush()", "close()", "B"}, //75
                    {"put()", "print()", "printf()", "write()", "B"}, //76
                    {"true", "false", "prints number of bytes in file", "prints number of characters in the file", "C"}, //77
                    {"abc", "ABC", "ab", "AB", "A"}, //78
                    {"abc", "ABC", "ab", "AB", "B"}, //79
                    {"AaBaCa", "ABCaaa", "AaaBaaCaa", "AaBaaCaaa", "D"}, //80
                    {"InputStream", "OutputStream", "Character Stream", "All of the mentioned", "C"}, //81
                    {"FileReader", "FileWriter", "FileInputStream", "InputStreamReader", "A"}, //82
                    {"read()", "scanf()", "get()", "getInteger()", "A"}, //83
                    {"BufferedReader", "FileReader", "CharArrayReader", "FileArrayReader", "C"}, //84
                    {"clear()", "flush()", "fflush()", "close()", "B"}, //85
                    {"BufferedReader", "Bufferedwriter", "PushbachReader", "CharArrayReader", "C"}, //86
                    {"true", "false", "prints number of bytes in file", "prints number of characters in the file", "C"}, //87
                    {"abc", "abcd", "abcde", "abcdef", "D"}, //88
                    {"abc", "abcd", "abcde", "abcdef", "A"}, //89
                    {"abc", "abcd", "abcde", "None of the mentioned", "D"} //90





            };


            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }


        if(position == 5)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.fq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fq20))




            };  //row0
            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.fs1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.fs20))



            };  //row0



            String[][] qst_options = {{"Serialization", "Externalization", "File Filtering", "All of the mentioned", "A"}, //1  //row_qst 0 options and ans
                    {"Serialization", "Garbage collection", "File Filtering", "All of the mentioned", "A"}, //2
                    {"Serializable", "Externalization", "FileFilter", "ObjectInput", "B"}, //3
                    {"Serializable", "Externalization", "ObjectOutput", "ObjectInput", "C"}, //4
                    {"clear()", "flush()", "fflush()", "close()", "B"}, //5
                    {"write()", "Write()", "StreamWrite()", "writeObject()", "D"}, //6
                    {"s=Hello; i=-7; d=2.1E10", "Hello; -7; 2.1E10", "s; i; 2.1E10", "Serialization", "A"}, //7
                    {"-7", "Hello", "2.1E10", "deserialization", "D"}, //8
                    {"abc", "abcd", "abcde", "None of the mentioned", "D"}, //9
                    {"3", "3.5", "serialization", "deserialization", "B"}, //10
                    {"Serialization", "Externalization", "File Filtering", "Deserialization", "D"}, //11
                    {"Serialization", "Memory allocation", "Deserialization", "All of the mentioned", "D"}, //12
                    {"Serializable", "Externalization", "FileFilter", "ObjectInput", "B"}, //13
                    {"Serializable", "Externalization", "ObjectOutput", "ObjectInput", "D"}, //14
                    {"int read()", "void close()", "Object readObject()", "Object WriteObject()", "C"}, //15
                    {"ObjectStream", "ObjectInputStream", "ObjectOutput", "ObjectInput", "B"}, //16
                    {"5", "void", "serialization", "deserialization", "A"}, //17
                    {"-7", "Hello", "2.1E10", "deserialization", "D"}, //18
                    {"1", "2", "3", "0", "D"}, //19
                    {"1", "2", "3", "4", "D"} //20


            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }



        if(position == 6)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.gq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gq60))




            };  //row0



            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.gs1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.gs60))



            };  //row0



            String[][] qst_options = {{"java.io", "java.util", "java.net", "java.network", "C"}, //1  //row_qst 0 options and ans
                    {"TCIP/IP", "DNS", "Socket", "Proxy Server", "A"}, //2
                    {"10", "1024", "2048", "512", "B"}, //3
                    {"8", "16", "32", "64", "C"}, //4
                    {"Data Network Service", "Data Name Service", "Domain Network Service", "Domian Name Service", "D"}, //5
                    {"DatagramPacket", "URL", "InetAddress", "ContentHandler", "C"}, //6
                    {"0", "1", "true", "false", "C"}, //7
                    {"0", "1", "true", "false", "D"}, //8
                    {"1", "2", "3", "0", "D"}, //9
                    {"cisco", "cisco.com", "www.cisco.com", "None of the mentioned", "B"}, //10
                    {"Uniform Resource Locator", "Uniform Resource Latch", "Universal Resource Locator", "Universal Resource Latch", "A"}, //11
                    {"URLNotFound", "URLSourceNotFound", "MalformedURLException", "URLNotFoundException", "C"}, //12
                    {"host()", "getHost()", "GetHost()", "gethost()", "B"}, //13
                    {"fullHost()", "getHost()", "ExternalForm()", "toExternalForm()", "D"}, //14
                    {"URL", "URLDecoder", "URLConnection", "All of the mentioned", "D"}, //15
                    {"DatagramPacket", "URL", "InetAddress", "ContentHandler", "C"}, //16
                    {"http", "https", "www", "com", "A"}, //17
                    {"1", "0", "-1", "garbage value", "C"}, //18
                    {"sanfoundry", "sanfoundry.com", "www.sanfoundry.com", "http://www.sanfoundry.com/javamcq", "C"}, //19
                    {"sanfoundry", "sanfoundry.com", "www.sanfoundry.com", "http://www.sanfoundry.com/javamcq", "D"}, //20
                    {"HTTP", "HttpResponse", "Httpserver", "httpserver", "A"}, //21
                    {"http", "https", "Any Protocol can be used", "None of the mentioned", "A"}, //22
                    {"LastModified()", "getLastModified()", "GetLastModified()", "getlastModified()()", "B"}, //23
                    {"ContentType()", "contentType()", "getContentType()", "GetContentType()", "C"}, //24
                    {"URL", "URLDecoder", "URLConnection", "All of the mentioned", "D"}, //25
                    {"status", "address", "statusResponse", "statusCode", "D"}, //26
                    {"html", "text", "html/text", "text/html", "D"}, //27
                    {"126", "127", "Compilation Error", "Runtime Error", "B"}, //28
                    {"july", "18-6-2013", "Tue 18 Jun 2013", "Tue Jun 18 2013", "D"}, //29
                    {"sanfoundry", "sanfoundry.com", "www.sanfoundry.com", "http://www.sanfoundry.com/javamcq", "D"}, //30
                    {"LogMessage", "LogResponse", "Httpdserver", "httpdResponse", "A"}, //31
                    {"httpServer", "ServerSockets", "MimeHeader", "HttpResponse", "B"}, //32
                    {"http", "https", "Mime", "httpd", "C"}, //33
                    {"parse()", "toString()", "getString()", "parseString()", "A"}, //34
                    {"http", "httpDecoder", "httpConnection", "httpd", "D"}, //35
                    {"string()", "toString()", "convertString()", "getString()", "B"}, //36
                    {"html", "text", "html/text", "text/html", "D"}, //37
                    {"port", "cache", "log", "All of the mentioned", "D"}, //38
                    {"port", "cache", "log", "stopFlag", "C"}, //39
                    {"sanfoundry", "sanfoundry.com", "www.sanfoundry.com", "http://www.sanfoundry.com/javamcq", "D"}, //40
                    {"getDta()", "GetResponse()", "getStream()", "getRawRequest()", "D"}, //41
                    {"log()", "logEntry()", "logHttpd()", "logResponse()", "B"}, //42
                    {"findfromCache()", "findFromCache()", "serveFromCache()", "getFromCache()", "C"}, //43
                    {"hits", "hitstocache", "hits_to_cache", "hits.to.cache", "D"}, //44
                    {"http", "httpDecoder", "httpConnection", "httpd", "D"}, //45
                    {"writeDiskCache()", "writetoDisk()", "writeCache()", "writeDiskEntry()", "A"}, //46
                    {"126", "127", "Compilation Error", "Runtime Error", "B"}, //47
                    {"run()", "start()", "runThread()", "startThread()", "A"}, //48
                    {"Handle()", "HandleGet()", "handleGet()", "Handleget()", "C"}, //49
                    {"cisco", "cisco.com", "www.cisco.com", "None of the mentioned", "B"}, //50
                    {"Mime", "cache", "Datagrams", "DatagramSocket", "C"}, //51
                    {"DatagramPacket", "DatagramSocket", "All of the mentioned", "None of the mentioned", "C"}, //52
                    {"port()", "getPort()", "findPort()", "recievePort()", "A"}, //53
                    {"getData()", "getBytes()", "getArray()", "recieveBytes()", "A"}, //54
                    {"getnumber()", "length()", "Length()", "getLength()", "D"}, //55
                    {"InetAdress", "DatagramPacket", "DatagramSocket", "All of the mentioned", "D"}, //56
                    {"html", "text", "html/text", "text/html", "D"}, //57
                    {"findAddress()", "getAddress()", "Address()", "whois()", "B"}, //58
                    {"DatagramPacket", "DatagramSocket", "InetAddress", "ServerSocket", "C"}, //59
                    {"sanfoundry", "sanfoundry.com", "www.sanfoundry.com", "http://www.sanfoundry.com/javamcq", "D"} //60


            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }




        if(position == 7)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.hq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hq70))



            };  //row0




            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.hs1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.hs70))




            };  //row0




            String[][] qst_options = {{"AbstractList", "LinkedList", "ArrayList", "AbstractSet", "C"}, //1   //row_qst 0 options and ans
                    {"ArrayList()", "DynamicList()", "LinkedList()", "DynamicList()", "A"}, //2
                    {"Capacity()", "increaseCapacity()", "increasecapacity()", "ensureCapacity()", "D"}, //3
                    {"size()", "length()", "index()", "capacity()", "A"}, //4
                    {"Array()", "covertArray()", "toArray()", "covertoArray()", "A"}, //5
                    {"trim()", "trimSize()", "trimTosize()", "trimToSize()", "D"}, //6
                    {"[A, B, C, D]", "[A, D, B, C]", "[A, D, C]", "[A, B, C]", "B"}, //7
                    {"0", "1", "2", "Any Garbage Value", "C"}, //8
                    {"1", "2", "3", "4", "A"}, //9
                    {"1", "2", "3", "4", "B"}, //10
                    {"AbstractList", "LinkedList", "HashSet", "AbstractSet", "B"}, //11
                    {"ArrayList", "HashSet", "LinkedList", "DynamicList", "B"}, //12
                    {"add()", "first()", "AddFirst()", "addFirst()", "D"}, //13
                    {"add()", "Add()", "addFirst()", "insert()", "A"}, //14
                    {"remove()", "delete()", "removeLast()", "deleteLast()", "C"}, //15
                    {"change()", "set()", "redo()", "add()", "C"}, //16
                    {"[A, B, C]", "[D, B, C]", "[A, B, C, D]", "[D, A, B, C]", "D"}, //17
                    {"[A, B]", "[B, C]", "[A, B, C, D]", "[A, B, C]", "B"}, //18
                    {"ABC 3", "[A, B, C] 3", "ABC 2", "[A, B, C] 2", "B"}, //19
                    {"[1, 3, 5, 8, 9]", "[3, 4, 1, 8, 9]", "[9, 8, 4, 3, 1]", "[1, 3, 4, 8, 9]", "D"}, //20
                    {"Hash table", "Map", "Array", "String", "B"}, //21
                    {"ArrayList", "HashMap", "LinkedList", "DynamicList", "B"}, //22
                    {"delete()", "remove()", "clear()", "removeAll()", "B"}, //23
                    {"search()", "get()", "set()", "look()", "A"}, //24
                    {"getAll()", "getKeys()", "keyall()", "keySet()", "D"}, //25
                    {"put()", "set()", "redo()", "add()", "A"}, //26
                    {"{A 1, B 1, C 1}", "{A, B, C}", "{A-1, B-1, C-1}", "{A=1, B=2, C=3}", "D"}, //27
                    {"[A, B, C]", "{A, B, C}", "{1, 2, 3}", "[1, 2, 3]", "A"}, //28
                    {"1", "2", "3", "null", "B"}, //29
                    {"[A, B, C]", "[1, 2, 3]", "{A=1, B=2, C=3}", "[A=1, B=2, C=3]", "D"}, //30
                    {"Array", "LinkedList", "HashSet", "AbstractSet", "A"}, //31
                    {"ArrayList", "HashSet", "LinkedList", "DynamicList", "B"}, //32
                    {"add()", "fill()", "all()", "set()", "B"}, //33
                    {"binarysort()", "bubblesort()", "sort()", "insert()", "C"}, //34
                    {"find()", "sort()", "get()", "binaryserach()", "D"}, //35
                    {"change()", "set()", "redo()", "add()", "C"}, //36
                    {"0", "1", "true", "false", "C"}, //37
                    {"12345", "54321", "1234", "5432", "B"}, //38
                    {"12885", "12845", "58881", "54881", "C"}, //39
                    {"2", "3", "4", "5", "B"}, //40
                    {"ArrayList", "Map", "Vector", "ArrayList & Map", "D"}, //41
                    {"Stack", "Hashtable", "Vector", "All of the mentioned", "D"}, //42
                    {"Map", "Enumeration", "HashMap", "Hashtable", "B"}, //43
                    {"length", "elements", "elementCount", "capacity", "C"}, //44
                    {"add()", "set()", "AddElement()", "addElement()", "D"}, //45
                    {"0", "3", "2", "5", "C"}, //46
                    {"2", "3", "4", "6", "C"}, //47
                    {"[3, 2, 6]", "[3, 2, 8]", "[3, 2, 6, 8]", "[3, 2, 8, 6]", "D"}, //48
                    {"0", "1", "true", "false", "C"}, //49
                    {"[3, 5]", "[3, 2]", "[3, 2, 5]", "[3, 5, 2]", "A"}, //50
                    {"Dictionary", "Map", "Hashtable", "All if the mentioned", "D"}, //51
                    {"put()", "set()", "insertElement()", "addElement()", "A"}, //52
                    {"Map", "Enumeration", "HashMap", "Hashtable", "A"}, //53
                    {"Array", "ArrayList", "Dictionary", "Properties", "D"}, //54
                    {"get()", "Elementat()", "ElementAt()", "getProperty()", "D"}, //55
                    {"0", "1", "true", "false", "D"}, //56
                    {"0", "1", "2", "3", "A"}, //57
                    {"{C=8, B=2}", "[C=8, B=2]", "{A=3, C=8, B=2}", "[A=3, C=8, B=2]", "B"}, //58
                    {"{C=8, B=2}", "[C=8, B=2]", "{A=3, C=8, B=2}", "[A=3, C=8, B=2]", "C"}, //59
                    {"{AB, BC, CD}", "[AB, BC, CD]", "[3, 2, 8]", "{3, 2, 8}", "B"}, //60
                    {"Bitset", "Map", "Hashtable", "All if the mentioned", "A"}, //61
                    {"put()", "set()", "remove()", "clear()", "D"}, //62
                    {"size()", "length()", "indexes()", "numberofBits()", "B"}, //63
                    {"after()", "contains()", "before()", "compareTo()", "C"}, //64
                    {"get()", "Elementat()", "ElementAt()", "getProperty()", "A"}, //65
                    {"{0, 1, 3, 4}", "{0, 1, 2, 4}", "{0, 1, 2, 3, 4}", "{0, 0, 0, 3, 4}", "A"}, //66
                    {"4 64", "5 64", "5 128", "4 128", "B"}, //67
                    {"2", "3", "4", "5", "A"}, //68
                    {"Prints Present Date", "Runtime Error", "Any Garbage Value", "Prints Present Time & Date", "D"}, //69
                    {"{0, 1}", "{2, 4}", "{3, 4}", "{3, 4, 5}", "C"} //70

            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }


        if(position == 8)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.iq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.iq40))



            };  //row0



            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.is1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.is40))




            };  //row0


            String[][] qst_options = {{"main method", "finalize method", "static method", "private method", "C"}, //1  //row_qst 0 options and ans
                    {"Function overriding", "Function overloading", "Function doubling", "None of these", "B"}, //2
                    {"Parameters data type", "Number of parameters", "Return type of method", "All of the mentioned", "D"}, //3
                    {"void", "int", "float", "All of the mentioned", "D"}, //4
                    {"Two or more methods with same name can be diffrenciated on the basis of their parameters data type.", "Two or more method having same name can be diffrentiated on basis of number of parameters.", "Any already defined method in java’s library can be defined again in the program with diffrent data type of parameters.", "If a method is returning a value the calling statement must have a varible to store that value.", "D"}, //5
                    {"0", "1", "6", "25", "C"}, //6
                    {"false", "true", "0", "1", "B"}, //7
                    {"0", "5", "25", "26", "B"}, //8
                    {"1", "2", "Runtime Error", "Compilation Error", "D"}, //9
                    {"0", "1", "25", "30", "D"}, //10
                    {"Run Time", "Compilation Time", "Can Occur Any Time", "None of the mentioned", "A"}, //11
                    {"try", "finally", "thrown", "catch", "C"}, //12
                    {"try", "finally", "throw", "catch", "A"}, //13
                    {"try", "finally", "throw", "catch", "D"}, //14
                    {"try", "finally", "throw", "catch", "C"}, //15
                    {"Hello", "World", "HelloWorld", "Hello World", "B"}, //16
                    {"A", "B", "Compilation Error", "Runtime Error", "B"}, //17
                    {"A", "B", "AC", "BC", "D"}, //18
                    {"0", "05", "Compilation Error", "Runtime Error", "C"}, //19
                    {"-1", "0", "-10", "-101", "C"}, //20
                    {"String", "RuntimeExceptions", "Throwable", "Cachable", "C"}, //21
                    {"Error", "Exception", "RuntimeExecption", "All of the mentioned", "B"}, //22
                    {"Error", "Exception", "RuntimeExecption", "All of the mentioned", "A"}, //23
                    {"Default handler", "finally", "throw handler", "Java run time system", "A"}, //24
                    {"try", "finally", "throw", "catch", "C"}, //25
                    {"Hello", "World", "Compilation Error", "First Exception then World", "D"}, //26
                    {"A", "B", "Compilation Error", "Runtime Error", "B"}, //27
                    {"12345", "123450", "1234500", "Compilation Error", "B"}, //28
                    {"0", "05", "Compilation Error", "Runtime Error", "C"}, //29
                    {"12345", "12345A", "12345B", "Comiplation Error", "C"}, //30
                    {"try", "finally", "throw", "catch", "C"}, //31
                    {"Error", "Exception", "Throwable", "Throw", "C"}, //32
                    {"new", "malloc", "alloc", "thrown", "A"}, //33
                    {"Default handler", "finally", "throw handler", "Java run time system", "A"}, //34
                    {"try", "throw", "throws", "catch", "C"}, //35
                    {"TypeA", "TypeB", "0TypeA", "0TypeB", "B"}, //36
                    {"A", "B", "Hello", "Runtime Error", "B"}, //37
                    {"A", "0", "0A", "Exception", "C"}, //38
                    {"TypeA", "TypeB", "0TypeA", "0TypeB", "C"}, //39
                    {"TypeA", "TypeB", "0TypeA", "0TypeB", "C"} //40

            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }




        if(position == 9)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.jq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.jq70)),





            };  //row0




            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.js1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.js70))




            };  //row0






            String[][] qst_options = {{"stop()", "sleep()", "join()", "call()", "B"}, //1  //row_qst 0 options and ans
                    {"run()", "Alive()", "isAlive()", "checkRun()", "C"}, //2
                    {"0 & 256", "0 & 1", "1 & 10", "1 & 256", "C"}, //3
                    {"sleep()", "isAlive()", "join()", "stop()", "C"}, //4
                    {"set()", "make()", "setPriority()", "makePriority()", "C"}, //5
                    {"It’s a process of handling situations when two or more threads need access to a shared resource.", "Its a process by which many thread are able to access same shared resource simultaneously.", "Its a process by which a method is able to access many different threads simultaneously.", "Its a method that allow to many threads to access any information require.", "A"}, //6
                    {"My Thread", "Thread[My Thread,5,main] ", "Compilation Error", "Runtime Error", "B"}, //7
                    {"My Thread", "Thread[My Thread,5,main]", "Exception", "Runtime Error", "D"}, //8
                    {"0", "1", "true", "false", "C"}, //9
                    {"true", "false", "truetrue", "falsefalse", "D"}, //10
                    {"stop()", "run()", "runThread()", "stopThread()", "B"}, //11
                    {"Runnable", "Connections", "Set", "MapConnections", "A"}, //12
                    {"run()", "start()", "runThread()", "startThread()", "B"}, //13
                    {"sleep()", "isAlive()", "join()", "stop()", "C"}, //14
                    {"A thread can be formed by implementing Runnable interface only.", "A thread can be formed by a class that extends Thread class.", "start() method is used to begin execution of the thread.", "run() method is used to begin execution of a thread before start() method in special cases.", "D"}, //15
                    {"My Thread", "Thread[My Thread,5,main]", "Compilation Error", "Runtime Error", "A"}, //16
                    {"My Thread", "Thread[My Thread,5,main] ", "Compilation Error", "Runtime Error", "B"}, //17
                    {"My Thread", "Thread[My Thread,5,main]", "Compilation Error", "Runtime Error", "C"}, //18
                    {"Thread[New Thread,0,main]", "Thread[New Thread,1,main] ", "Thread[New Thread,5,main]", "Thread[New Thread,10,main]", "D"}, //19
                    {"true", "false", "truetrue", "falsefalse", "D"}, //20
                    {"String", "System", "Thread", "Runnable", "C"}, //21
                    {"Runnable", "Connections", "Set", "MapConnections", "A"}, //22
                    {"get()", "ThreadPriority()", "getPriority()", "getThreadPriority()", "C"}, //23
                    {"sleep()", "terminate()", "suspend()", "stop()", "A"}, //24
                    {"isAlive()", "Join()", "isRunning()", "Alive()", "A"}, //25
                    {"Thread[5,main]", "Thread[New Thread,5]", "Thread[main,5,main]", "Thread[New Thread,5,main]", "D"}, //26
                    {"main", "Thread", "New Thread", "Thread[New Thread,5,main]", "C"}, //27
                    {"0", "1", "4", "5", "D"}, //28
                    {"0", "1", "true", "false", "C"}, //29
                    {"String", "System", "Thread", "Runnable", "C"}, //30
                    {"It’s a process in which two different processes run simultaneously.", "It’s a process in which two or more parts of same process run simultaneously.", "Its a process in which many different process are able to access same information.", "Its a process in which a single process can access information from many sources.", "B"}, //31
                    {"Process based", "Thread based", "Process and Thread based", "None of the mentioned", "C"}, //32
                    {"java.io", "java.util", "java.lang", "java.net", "C"}, //33
                    {"Integer", "Float", "double", "long", "A"}, //34
                    {"Any one will be executed first lexographically", "Both of them will be executed simultaneously", "None of them will be executed", "It is dependent on the operating system.", "D"}, //35
                    {"By multithreading CPU’s idle time is minimized, and we can take maximum use of it.", "By multitasking CPU’s idle time is minimized, and we can take maximum use of it.", "Two thread in Java can have same priority", "A thread can exist only in two states, running and blocked.", "D"}, //36
                    {"Thread[5,main]", "Thread[main,5]", "Thread[main,0]", "Thread[main,5,main]", "D"}, //37
                    {"4", "5", "0", "1", "B"}, //38
                    {"main", "Thread", "System", "None of the mentioned", "A"}, //39
                    {"0", "1", "true", "false", "A"}, //40
                    {"java.io", "java.util", "java.net", "java.network", "C"}, //41
                    {"TCIP/IP", "DNS", "Socket", "Proxy Server", "A"}, //42
                    {"10", "1024", "2048", "512", "B"}, //43
                    {"8", "16", "32", "64", "C"}, //44
                    {"Data Network Service", "Data Name Service", "Domain Network Service", "Domian Name Service", "D"}, //45
                    {"DatagramPacket", "URL", "InetAddress", "ContentHandler", "C"}, //46
                    {"0", "1", "true", "false", "C"}, //47
                    {"0", "1", "true", "false", "D"}, //48
                    {"1", "2", "3", "0", "D"}, //49
                    {"cisco", "cisco.com", "www.cisco.com", "None of the mentioned", "B"}, //50
                    {"throws", "finally", "throw", "catch", "B"}, //51
                    {"finally", "catch", "finally & catch", "None of the mentioned", "C"}, //52
                    {"java.io", "java.util", "java.lang", "java.net", "C"}, //53
                    {"ArithmeticException", "MathException", "IllegalAccessException", "IllegarException", "A"}, //54
                    {"ArithmeticException", "ArrayException", "ArrayIndexException", "ArrayIndexOutOfBoundsException", "D"}, //55
                    {"0", "1", "Compilation Error", "Runtime Error", "B"}, //56
                    {"A", "B", "Compilation Error", "Runtime Error", "D"}, //57
                    {"A", "B", "AB", "BA", "A"}, //58
                    {"A", "B", "AB", "BA", "A"}, //59
                    {"TypeA", "TypeB", "Compilation Error", "Runtime Error", "C"}, //60
                    {"sunchronize", "syn", "synch", "synchronized", "D"}, //61
                    {"wait()", "notify()", "notifyAll()", "All of the mentioned", "D"}, //62
                    {"wait()", "notify()", "notifyAll()", "sleep()", "A"}, //63
                    {"wake()", "notify()", "start()", "notifyAll()", "B"}, //64
                    {"wakeAll()", "notify()", "start()", "notifyAll()", "D"}, //65
                    {"Its a process of handling situations when two or more threads need access to a shared resource.", "Its a process by which many thread are able to access same shared resource simultaneously.", "Its a process by which a method is able to access many different threads simultaneously.", "Its a method that allow to many threads to access any information the require.", "A"}, //66
                    {"true", "false", "Main thread interrupted", "None of the mentioned", "C"}, //67
                    {"true", "false", "Main thread interrupted", "None of the mentioned", "B"}, //68
                    {"true", "false", "Main thread interrupted", "None of the mentioned", "B"}, //69
                    {"true", "false", "truetrue", "falsefalse", "D"}, //70


            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }


        if(position == 10)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.kq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.kq40))






            };  //row0




            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.ks1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ks40))





            };  //row0





            String[][] qst_options = {{"All Window Tools", "All Writing Tools", "Abstract Window Toolkit", "Abstract Writing Toolkit", "C"}, //1  //row_qst 0 options and ans
                    {"streams", "Variables", "classes", "Methods", "A"}, //2
                    {"Integer stream", "Short stream", "Byte stream", "Long stream", "C"}, //3
                    {"InputStream", "InputOutputStream", "Reader", "All of the mentioned", "A"}, //4
                    {"InputStream", "Writer", "ReadStream", "InputOutputStream", "B"}, //5
                    {"InputStream", "BufferedInputStream", "ArrayInputStream", "ByteArrayInputStream", "D"}, //6
                    {"abcqfgh", "abc", "abcq", "abcqfghq", "C"}, //7
                    {"abc’", "abcdef/’", "abc’def/’egh", "abcqfghq", "A"}, //8
                    {"4", "5", "6", "7", "B"}, //9
                    {"Hello", "olleH", "HelloolleH", "olleHHello", "B"}, //10
                    {"IOException", "InterruptedException", "SystemException", "SystemInputException", "A"}, //11
                    {"get()", "getLine()", "read()", "readLine()", "D"}, //12
                    {"BufferedReader", "StringReader", "BufferedStreamReader", "InputStreamReader", "A"}, //13
                    {"InputStream", "InputOutputStream", "Reader", "All of the mentioned", "A"}, //14
                    {"InputStream", "InputOutputStream", "BufferedInputStream", "SequenceInputStream", "A"}, //15
                    {"InputStream", "BufferedInputStream", "FileInputStream", "BufferedFileInputStream", "C"}, //16
                    {"Hello", "Hello stop", "World", "Hello stop World", "D"}, //17
                    {"Hello", "World", "Helloworld", "Hello World", "D"}, //18
                    {"xello", "xxxxx", "Hxllo", "Hexlo", "C"}, //19
                    {"abc’", "abcdef/’", "abc’def/’egh", "abcqfghq", "A"}, //20
                    {"System", "System.out", "BUfferedOutputStream", "PrintStream", "D"}, //21
                    {"print()", "println()", "write()", "All of the mentioned", "D"}, //22
                    {"String()", "StringBuffer()", "Both of the mentioned", "None of the mentioned", "B"}, //23
                    {"reverse()", "reverseall()", "Reverse()", "reverseAll()", "A"}, //24
                    {"InputStream", "Writer", "ReadStream", "InputOutputStream", "B"}, //25
                    {"reverse() method reverses all characters.", "reverseall() method reverses all characters.", "replace() method replaces first occurrence of a character in invoking string with another character.", "replace() method replaces last occurrence of a character in invoking string with another character.", "A"}, //26
                    {"6 4 6 9", "5 4 5 9", "7 8 8 9", "4 3 6 9", "A"}, //27
                    {"Hello", "olleH", "HelloolleH", "olleHHello", "B"}, //28
                    {"HelloGoodWorld", "HellGoodoWorld", "HellGood oWorld", "Hello Good World", "D"}, //29
                    {"a is a lower case Letter\n" +
                            "is White space character", "b is a lower case Letter\n" +
                            "is White space characte", "a is a lower case Letter\n" +
                            "A is a upper case Letter", "a is a lower case Letter\n" +
                            "0 is a digit", "A"}, //30
                    {"FileStream", "FileInputStream", "BUfferedOutputStream", "FileBufferStream", "B"}, //31
                    {"IOException", "FileException", "FileNotFoundException", "FileInputException", "C"}, //32
                    {"get()", "read()", "scan()", "readFileInput()", "B"}, //33
                    {"0", "1", "-1", "Null", "C"}, //34
                    {"IOException", "FileException", "FileNotFoundException", "FileInputOutputException", "A"}, //35
                    {"put()", "putFile()", "write()", "writeFile()", "C"}, //36
                    {"true", "false", "prints number of bytes in file", "prints number of characters in the file", "C"}, //37
                    {"AaBaCa", "ABCaaa", "AaaBaaCaa", "AaBaaCaaa", "D"}, //38
                    {"abc", "abcd", "abcde", "abcdef", "A"}, //39
                    {"abc", "abcd", "abcde", "None of the mentioned", "D"} //40



            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }




        if(position == 11)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.lq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.lq40))




            };  //row0




            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.ls1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ls40))





            };  //row0

            String[][] qst_options = {{"display()", "paint()", "displayApplet()", "PrintApplet()", "B"}, //1  //row_qst 0 options and ans
                    {"display()", "paint()", "drawString()", "transient()", "C"}, //2
                    {"All Window Tools", "All Writing Tools", "Abstract Window Toolkit", "Abstract Writing Toolkit", "C"}, //3
                    {"display()", "paint()", "drawString()", "transient()", "B"}, //4
                    {"transient", "volatile", "global", "No modifier is needed", "B"}, //5
                    {"getInfo", "Info", "instanceof", "getinfoof", "C"}, //6
                    {"A Simple Applet", "A Simple Applet 20 20", "Compilation Error", "Runtime Error", "A"}, //7
                    {"20", "50", "100", "System dependent", "A"}, //8
                    {"20", "Default value", "Compilation Error", "Runtime Error", "C"}, //9
                    {"abc", "abcd", "abcde", "None of the mentioned", "D"}, //10
                    {"java.applet", "java.awt", "java.awt.image", "java.io", "B"}, //11
                    {"java.applet", "java.awt", "java.io", "java.lang.reflect", "D"}, //12
                    {"java.security", "java.lang.security", "java.awt.image", "java.io.security", "A"}, //13
                    {"java.io", "GetInformation", "ReflectPermission", "MembersPermission", "C"}, //14
                    {"java.rmi", "java.awt", "java.util", "java.applet", "A"}, //15
                    {"java.text", "java.awt", "java.lang.text", "java.text.mofify", "A"}, //16
                    {"Program prints all the constructors of ‘java.awt.Dimension’ package.", "Program prints all the possible constructors of class ‘Class’.", "Program prints “Exception”", "Runtime Error", "A"}, //17
                    {"Program prints all the constructors of ‘java.awt.Dimension’ package.", "Program prints all the methods of ‘java.awt.Dimension’ package.", "Program prints all the data members of ‘java.awt.Dimension’ package.", "program prints all the methods and data member of ‘java.awt.Dimension’ package.", "C"}, //18
                    {"20", "Default value", "Compilation Error", "Runtime Error", "C"}, //19
                    {"Program prints all the constructors of ‘java.awt.Dimension’ package.", "Program prints all the methods of ‘java.awt.Dimension’ package.", "Program prints all the data members of ‘java.awt.Dimension’ package.", "program prints all the methods and data member of ‘java.awt.Dimension’ package.", "B"}, //20
                    {"RMI allows us to invoke a method of java object that executes on another machine.", "RMI allows us to invoke a method of java object that executes on another Thread in multithreaded programming.", "RMI allows us to invoke a method of java object that executes parallely in same machine.", "None of the mentioned", "A"}, //21
                    {"java.applet", "java.rmi", "java.lang.rmi", "java.lang.reflect", "B"}, //22
                    {"checkIP()", "addLocation()", "AddServer()", "None of the mentioned", "D"}, //23
                    {"RemoteException", "InputOutputException", "RemoteAccessException", "RemoteInputOutputException", "A"}, //24
                    {"serverClientjava", "Client.java", "AddClient.java", "ServerClient.java", "C"}, //25
                    {"java.text", "java.awt", "java.lang.text", "java.text.mofify", "A"}, //26
                    {"Program prints all the constructors of ‘java.awt.Dimension’ package.", "Program prints all the methods of ‘java.awt.Dimension’ package.", "Program prints all the data members of ‘java.awt.Dimension’ package.", "program prints all the methods and data member of ‘java.awt.Dimension’ package.", "C"}, //27
                    {"Program prints all the constructors of ‘java.awt.Dimension’ package.", "Program prints all the methods of ‘java.awt.Dimension’ package.", "Program prints all the data members of ‘java.awt.Dimension’ package.", "program prints all the methods and data member of ‘java.awt.Dimension’ package.", "C"}, //28
                    {"20", "Default value", "Compilation Error", "Runtime Error", "C"}, //29
                    {"Program prints all the constructors of ‘java.awt.Dimension’ package.", "Program prints all the methods of ‘java.awt.Dimension’ package.", "Program prints all the data members of ‘java.awt.Dimension’ package.", "program prints all the methods and data member of ‘java.awt.Dimension’ package.", "B"}, //30
                    {"java.text", "java.awt", "java.awt.text", "java.io", "A"}, //31
                    {"Date", "SimpleDate", "DateFormat", "textFormat", "C"}, //32
                    {"getTime()", "getTimeInstance()", "getTimeDateinstance()", "getDateFormatinstance()", "B"}, //33
                    {"DefinedDateFormat", "SimpleDateFormat", "ComplexDateFormat", "UsersDateFormat", "B"}, //34
                    {"a", "b", "c", "d", "A"}, //35
                    {"w", "W", "s", "S", "A"}, //36
                    {"3:55:4", "3.55.4", "55:03:04", "03:55:04", "C"}, //37
                    {"3:55:4", "3.55.4", "55:03:04", "03:55:04", "D"}, //38
                    {"Mon Jul 15 2013", "Jul 15 2013", "55:03:04 Mon Jul 15 2013", "03:55:04 Jul 15 2013", "A"}, //39
                    {"z", "Jul", "Mon", "PDT", "D"} //40




            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }





        if(position == 12)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.mq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.mq50))





            };  //row0



            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.ms1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ms50)),




            };  //row0

            String[][] qst_options = {{"java.applet", "java.awt", "java.event", "java.awt.event", "D"}, //1  //row_qst 0 options and ans
                    {"An event is an object that describes a state change in a source.", "An event is an object that describes a state change in processing.", "An event is an object that describes any change by the user and system.", "An event is a class used for defining object, to create events.", "A"}, //2
                    {"KeyListener()", "addKistener()", "addKeyListener()", "eventKeyboardListener()", "C"}, //3
                    {"addMouse()", "addMouseListener()", "addMouseMotionListner()", "eventMouseMotionListener()", "C"}, //4
                    {"A listener is a variable that is notified when an event occurs.", "A listener is a object that is notified when an event occurs.", "A listener is a method that is notified when an event occurs.", "None of the mentioned", "B"}, //5
                    {"java.io", "java.lang", "java.net", "java.util", "D"}, //6
                    {"getID()", "getSource()", "getEvent()", "getEventObject()", "A"}, //7
                    {"EventObject", "EventClass", "ActionEvent", "ItemEvent", "A"}, //8
                    {"ActionEvent", "ComponentEvent", "AdjustmentEvent", "WindowEvent", "C"}, //9
                    {"ActionEvent", "ComponentEvent", "AdjustmentEvent", "WindowEvent", "D"}, //10
                    {"ActionEvent", "KeyEvent", "WindowEvent", "AdjustmentEvent", "A"}, //11
                    {"An event is an object that describes a state change in a source.", "An event is an object that describes a state change in processing.", "An event is an object that describes any change by the user and system.", "An event is a class used for defining object, to create events.", "A"}, //12
                    {"getCommand()", "getActionCommand()", "getActionEvent()", "getActionEventCommand()", "B"}, //13
                    {"ALT_MASK", "CTRL_MASK", "SHIFT_MASK", "All of the mentioned", "D"}, //14
                    {"getKey()", "getModifier()", "getActionKey()", "getActionEvent()", "B"}, //15
                    {"ActionEvent", "KeyEvent", "WindowEvent", "AdjustmentEvent", "D"}, //16
                    {"getType()", "getEventType()", "getAdjustmentType()", "getEventObjectType()", "C"}, //17
                    {"getValue()", "getAdjustmentType()", "getAdjustmentValue()", "getAdjustmentAmount()", "A"}, //18
                    {"ActionEvent", "ComponentEvent", "AdjustmentEvent", "WindowEvent", "C"}, //19
                    {"BLOCK_DECREMENT", "BLOCK_INCREMENT", "UNIT_DECREMENT", "UNIT_INCREMENT", "D"}, //20
                    {"ComponentEvent", "ContainerEvent", "FocusEvent", "InputEvent", "A"}, //21
                    {"ComponentEvent", "ContainerEvent", "FocusEvent", "InputEvent", "B"}, //22
                    {"getContainer()", "getContainerCommand()", "getActionEvent()", "getContainerEvent()", "D"}, //23
                    {"getComponent()", "getchild()", "getContainerComponent()", "getComponentChild()", "B"}, //24
                    {"COMPONENT_HIDDEN", "COMPONENT_MOVED", "COMPONENT_RESIZE", "All of the mentioned", "D"}, //25
                    {"ComponentEvent", "ContainerEvent", "FocusEvent", "InputEvent", "C"}, //26
                    {"ComponentEvent", "ContainerEvent", "ItemEvent", "InputEvent", "A"}, //27
                    {"typeFocus()", "typeEventFocus()", "isTemporary()", "isPermanent()", "C"}, //28
                    {"ActionEvent", "ComponentEvent", "AdjustmentEvent", "WindowEvent", "C"}, //29
                    {"WindowEvent", "ComponentEvent", "ItemEvent", "InputEvent", "B"}, //30
                    {"TextEvent", "MouseEvent", "FocusEvent", "WindowEvent", "D"}, //31
                    {"ComponentEvent", "ContainerEvent", "FocusEvent", "InputEvent", "B"}, //32
                    {"getPoint()", "getCoordinates()", "getMouseXY()", "getMouseCordinates()", "A"}, //33
                    {"ChangePoint()", "TranslatePoint()", "ChangeCordinates()", "TranslateCordinates()", "B"}, //34
                    {"TEXT_CHANGED", "TEXT_FORMAT_CHANGED", "TEXT_VALUE_CHANGED", "TEXT_sIZE_CHANGED", "B"}, //35
                    {"getMethod()", "getWindow()", "getWindowEvent()", "getWindowObject()", "B"}, //36
                    {"ComponentEvent", "ContainerEvent", "ItemEvent", "InputEvent", "D"}, //37
                    {"getX()", "getXCoordinate()", "getCoordinateX()", "getPointX()", "A"}, //38
                    {"WINDOW_ACTIVATED", "WINDOW_CLOSED", "WINDOW_DEICONIFIED", "All of the mentioned", "D"}, //39
                    {"WindowEvent", "ComponentEvent", "ItemEvent", "InputEvent", "B"}, //40
                    {"java.lang", "java.awt", "java.awt.event", "java.event", "C"}, //41
                    {"ComponentListener", "ContainerListener", "FocusListener", "InputListener", "B"}, //42
                    {"ComponentListener", "ContainerListener", "ActionListener", "InputListener", "C"}, //43
                    {"ComponentListener", "ContainerListener", "ActionListener", "InputListener", "A"}, //44
                    {"ComponentListener", "ContainerListener", "ActionListener", "ItemListener", "D"}, //45
                    {"mouseClicked()", "mouseEntered()", "mousePressed()", "All of the mentioned", "D"}, //46
                    {"keyPressed()", "keyReleased()", "keyTyped()", "keyEntered()", "C"}, //47
                    {"mouseDragged()", "mousePressed()", "mouseReleased()", "mouseClicked()", "A"}, //48
                    {"WINDOW_ACTIVATED", "WINDOW_CLOSED", "WINDOW_DEICONIFIED", "All of the mentioned", "D"}, //49
                    {"Applet", "ComponentEvent", "Event", "InputEvent", "A"} //50


            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }






        if(position == 13)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.nq1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq70)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq71)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq72)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq73)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq74)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq75)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq76)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq77)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq78)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq79)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq80)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq81)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq82)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq83)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq84)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq85)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq86)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq87)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq88)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq89)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.nq90))





            };  //row0




            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.ns1)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns2)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns3)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns4)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns5)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns6)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns7)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns8)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns9)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns10)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns11)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns12)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns13)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns14)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns15)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns16)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns17)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns18)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns19)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns20)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns21)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns22)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns23)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns24)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns25)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns26)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns27)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns28)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns29)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns30)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns31)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns32)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns33)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns34)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns35)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns36)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns37)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns38)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns39)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns40)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns41)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns42)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns43)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns44)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns45)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns46)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns47)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns48)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns49)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns50)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns51)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns52)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns53)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns54)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns55)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns56)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns57)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns58)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns59)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns60)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns61)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns62)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns63)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns64)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns65)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns66)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns67)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns68)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns69)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns70)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns71)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns72)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns73)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns74)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns75)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns76)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns77)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns78)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns79)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns80)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns81)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns82)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns83)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns84)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns85)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns86)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns87)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns88)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns89)),
                    homePage.TestFileRead(getResources().openRawResource(R.raw.ns90))





            };  //row0




            String[][] qst_options = {{"Math", "Process", "System", "Object", "A"}, //1  //row_qst 0 options and ans
                    {"double ciel(double X)", "double floor(double X)", "double max(double X)", "double min(double X)", "A"}, //2
                    {"double ciel(double X)", "double floor(double X)", "double max(double X)", "double min(double X)", "B"}, //3
                    {"max()", "min()", "abs()", "rint()", "D"}, //4
                    {"Math", "Process", "System", "Object", "A"}, //5
                    {"abs()", "absolute()", "absolutevariable()", "None of the mentioned", "A"}, //6
                    {"1 2 0 0", "1 2 1 2", "0 0 0 0", "System Dependent", "B"}, //7
                    {"0", "3", "3.0", "3.1", "B"}, //8
                    {"0", "3", "3.0", "4", "D"}, //9
                    {"0", "3", "3.0", "4", "D"}, //10
                    {"SystemMath", "StrictMath", "Compiler", "ClassLoader", "B"}, //11
                    {"rand()", "random()", "randomNumber()", "randGenerator()", "B"}, //12
                    {"remainder()", "getRemainder()", "CSIremainder()", "IEEEremainder()", "D"}, //13
                    {"toRadian()", "toDegree()", "convertRadian()", "converDegree()", "B"}, //14
                    {"Java 1.0", "Java 1.5", "Java 2.0", "Java 3.0", "C"}, //15
                    {"double ciel(double X)", "double floor(double X)", "double max(double X)", "double min(double X)", "A"}, //16
                    {"0", "179", "180", "360", "B"}, //17
                    {"0", "3", "3.0", "3.1", "B"}, //18
                    {"0", "1", "2", "3", "B"}, //19
                    {"Yes", "No", "Compiler Dependent", "Operating System Dependent", "B"}, //20
                    {"Runnable interface", "Math interface", "System interface", "ThreadHandling interface", "D"}, //21
                    {"String", "System", "Thread", "Runnable", "C"}, //22
                    {"Runnable", "Connections", "Set", "MapConnections", "A"}, //23
                    {"sleep()", "terminate()", "suspend()", "stop()", "A"}, //24
                    {"Java 1.0", "Java 1.5", "Java 2.0", "Java 3.0", "C"}, //25
                    {"true", "false", "truetrue", "falsefalse", "D"}, //26
                    {"Thread[New Thread,0,main]", "Thread[New Thread,1,main]", "Thread[New Thread,5,main]", "Thread[New Thread,10,main]", "D"}, //27
                    {"My Thread", "Thread[My Thread,5,main]", "Compilation Error", "Runtime Error", "C"}, //28
                    {"My Thread", "Thread[My Thread,5,main]", "Compilation Error", "Runtime Error", "A"}, //29
                    {"My Thread", "Thread[My Thread,5,main]", "Compilation Error", "Runtime Error", "B"}, //30
                    {"Long", "Digits", "Float", "Number", "D"}, //31
                    {"doubleValue()", "converDouble()", "getDouble()", "getDoubleValue()", "A"}, //32
                    {"isNaN()", "isNumber()", "checkNaN()", "checkNumber()", "A"}, //33
                    {"Infinite()", "isInfinite()", "checkInfinite()", "None of the mentioned", "B"}, //34
                    {"IOException", "SystemException", "CastException", "ClassCastException", "D"}, //35
                    {"true", "false", "0", "1", "B"}, //36
                    {"0", "1", "256", "257", "B"}, //37
                    {"0", "1", "256", "257", "D"}, //38
                    {"0", "257.0", "257.57812", "257.578123456789", "C"}, //39
                    {"0", "1", "Exception", "None of the mentioned", "B"}, //40
                    {"toString()", "getString()", "decode()", "encode()", "C"}, //41
                    {"doubleValue()", "converDouble()", "getDouble()", "getDoubleValue()", "A"}, //42
                    {"Long", "Digits", "Float", "Number", "D"}, //43
                    {"intValue()", "isInfinite()", "toString()", "hashCode()", "B"}, //44
                    {"IOException", "SystemException", "CastException", "ClassCastException", "D"}, //45
                    {"0", "1.7976931348623157E308", "1.7976931348623157E30", "None of the mentioned", "B"}, //46
                    {"0", "4.9E-324", "1.7976931348623157E308", "None of the mentioned", "B"}, //47
                    {"0", "1", "256", "257", "B"}, //48
                    {"0", "257.0", "257.57812", "257.578123456789", "C"}, //49
                    {"0", "1", "Exception", "None of the mentioned", "B"}, //50
                    {"get()", "getVhar()", "getValue()", "getCharacter()", "C"}, //51
                    {"MAX_RADIX", "MAX_VALUE", "TYPE", "All of the mentioned", "D"}, //52
                    {"Long", "Digits", "Float", "Number", "D"}, //53
                    {"isIdentifier()", "isJavaIdentifier()", "isJavaIdentifierPart()", "None of the mentioned", "C"}, //54
                    {"Latin", "ASCII", "ANSI", "UNICODE", "D"}, //55
                    {"<", ">", "?", "$", "C"}, //56
                    {"<", "!", "@", "Space", "D"}, //57
                    {"true false true", "false true true", "true true false", "false false false", "B"}, //58
                    {"b", "c", "B", "C", "C"}, //59
                    {"b", "c", "B", "C", "C"}, //60
                    {"getBool()", "booleanValue()", "getbooleanValue()", "getboolValue()", "B"}, //61
                    {"TRUE", "FLASE", "TYPE", "All of the mentioned", "D"}, //62
                    {"getString()", "toString()", "converString()", "getStringObject()", "B"}, //63
                    {"valueOf()", "valueOfString()", "getString()", "None of the mentioned", "A"}, //64
                    {"Character", "Boolean", "Byte", "void", "D"}, //65
                    {"true", "flase", "Compilation Error", "Runtime Error", "A"}, //66
                    {"true", "false", "Compilation Error", "Runtime Error", "B"}, //67
                    {"true", "flase", "Compilation Error", "Runtime Error", "A"}, //68
                    {"true", "false", "System Dependent", "Compilation Error", "B"}, //69
                    {"true", "false", "System Dependent", "Compilation Error", "B"}, //70
                    {"Class", "System", "Runtime", "ClassLoader", "C"}, //71
                    {"IOException", "SystemException", "SecurityException", "RuntimeException", "C"}, //72
                    {"getMemory()", "TotalMemory()", "SystemMemory()", "getProcessMemory()", "B"}, //73
                    {"Class", "System", "Runtime", "ClassLoader", "D"}, //74
                    {"getClass()", "findClass()", "getSystemClass()", "findSystemClass()", "D"}, //75
                    {"IOException", "SystemException", "ClassFormatError", "ClassNotFoundException", "D"}, //76
                    {"X", "Y", "class X", "class Y", "C"}, //77
                    {"0", "1", "true", "false", "D"}, //78
                    {"0", "1", "true", "false", "D"}, //79
                    {"0", "1", "true", "false", "D"}, //80
                    {"Class", "System", "Runtime", "Catche", "A"}, //81
                    {"TRUE", "FLASE", "TYPE", "All of the mentioned", "D"}, //82
                    {"getClass()", "Class()", "WhoseClass()", "WhoseObject()", "A"}, //83
                    {"valueOf()", "valueOfString()", "getString()", "None of the mentioned", "A"}, //84
                    {"Character", "Boolean", "Byte", "void", "D"}, //85
                    {"X", "Y", "a", "b", "A"}, //86
                    {"X", "Y", "class X", "class Y", "C"}, //87
                    {"0", "1", "true", "false", "D"}, //88
                    {"0", "1", "true", "false", "D"}, //89
                    {"0", "1", "true", "false", "D"} //90



            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }


        if(position == 14)
        {
            String[] row_questions = collection_framework_row_questions();



            String[] row_solutions = collection_framework_row_solution();



            String[][] qst_options = collection_framework_qst_options();



            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }


/*
        if(position == 14)
        {
            String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst4)),homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst5))};  //row0
            String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst4ex)),homePage.TestFileRead(getResources().openRawResource(R.raw.oneqst5ex))};  //row0

            String[][] qst_options = {{"tayo", "bola", "seun", "segun", "1"},   //row_qst 0 options and ans
                    {"bola", "kola", "dayo", "sule", "2"}
            };

            practice_solution_fragment.setBundles(position, title,row_questions,row_solutions,qst_options);
        }

*/
        ft.replace(R.id.practice_frame_layout,practice_solution_fragment);
        ft.addToBackStack(null);
        ft.commit();

    }



    //cos of code too large issue

    public String[] collection_framework_row_questions()
    {
        String[] row_questions = {homePage.TestFileRead(getResources().openRawResource(R.raw.pq1)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq2)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq3)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq4)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq5)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq6)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq7)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq8)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq9)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq10)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq11)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq12)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq13)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq14)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq15)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq16)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq17)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq18)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq19)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq20)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq21)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq22)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq23)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq24)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq25)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq26)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq27)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq28)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq29)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq30)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq31)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq32)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq33)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq34)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq35)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq36)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq37)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq38)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq39)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq40)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq41)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq42)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq43)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq44)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq45)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq46)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq47)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq48)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq49)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq50)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq51)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq52)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq53)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq54)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq55)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq56)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq57)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq58)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq59)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq60)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq61)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq62)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq63)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq64)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq65)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq66)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq67)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq68)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq69)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq70)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq71)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq72)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq73)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq74)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq75)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq76)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq77)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq78)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq79)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq80)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq81)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq82)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq83)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq84)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq85)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq86)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq87)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq88)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq89)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq90)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq91)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq92)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq93)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq94)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq95)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq96)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq97)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq98)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq99)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq100)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq101)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq102)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq103)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq104)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq105)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq106)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq107)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq108)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq109)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq110)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq111)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq112)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq113)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq114)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq115)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq116)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq117)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq118)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq119)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq120)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq121)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq122)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq123)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq124)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq125)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq126)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq127)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq128)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq129)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq130)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq131)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq132)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq133)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq134)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq135)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq136)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq137)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq138)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq139)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq140)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq141)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq142)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq143)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq144)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq145)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq146)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq147)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq148)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq149)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq150)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq151)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq152)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq153)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq154)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq155)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq156)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq157)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq158)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq159)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq160)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq161)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq162)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq163)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq164)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq165)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq166)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq167)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq168)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq169)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.pq170))



        };  //row0

        return row_questions;
    }

    public String[] collection_framework_row_solution()
    {
        String[] row_solutions = {homePage.TestFileRead(getResources().openRawResource(R.raw.ps1)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps2)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps3)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps4)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps5)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps6)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps7)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps8)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps9)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps10)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps11)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps12)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps13)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps14)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps15)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps16)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps17)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps18)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps19)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps20)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps21)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps22)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps23)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps24)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps25)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps26)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps27)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps28)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps29)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps30)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps31)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps32)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps33)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps34)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps35)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps36)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps37)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps38)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps39)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps40)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps41)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps42)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps43)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps44)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps45)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps46)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps47)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps48)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps49)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps50)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps51)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps52)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps53)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps54)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps55)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps56)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps57)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps58)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps59)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps60)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps61)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps62)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps63)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps64)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps65)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps66)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps67)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps68)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps69)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps70)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps71)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps72)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps73)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps74)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps75)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps76)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps77)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps78)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps79)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps80)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps81)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps82)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps83)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps84)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps85)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps86)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps87)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps88)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps89)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps90)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps91)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps92)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps93)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps94)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps95)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps96)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps97)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps98)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps99)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps100)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps101)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps102)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps103)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps104)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps105)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps106)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps107)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps108)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps109)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps110)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps111)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps112)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps113)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps114)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps115)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps116)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps117)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps118)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps119)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps120)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps121)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps122)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps123)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps124)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps125)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps126)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps127)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps128)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps129)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps130)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps131)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps132)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps133)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps134)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps135)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps136)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps137)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps138)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps139)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps140)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps141)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps142)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps143)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps144)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps145)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps146)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps147)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps148)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps149)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps150)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps151)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps152)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps153)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps154)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps155)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps156)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps157)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps158)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps159)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps160)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps161)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps162)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps163)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps164)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps165)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps166)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps167)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps168)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps169)),
                homePage.TestFileRead(getResources().openRawResource(R.raw.ps170))






        };  //row0


        return row_solutions;

    }

    public String[][] collection_framework_qst_options()
    {
        String[][] qst_options = {{"java.lang", "java.util", "java.net", "java.awt", "B"},  //1   //row_qst 0 options and ans
                {"Maps", "Array", "Stack", "Queue", "D"},  //2
                {"List", "Set", "SortedMap", "SortedList", "D"},  //3
                {"clear()", "reset()", "delete()", "refresh()", "A"},  //4
                {"A group of objects", "A group of classes", "A group of interfaces", "None of the mentioned", "A"},  //5
                {"12885", "12845", "58881", "54881", "C"},  //6
                {"0", "1", "true", "false", "C"},  //7
                {"[3, 5]", "[3, 2]", "[3, 2, 5]", "[3, 5, 2]", "A"},  //8
                {"{C=8, B=2}", "[C=8, B=2]", "{A=3, C=8, B=2}", "[A=3, C=8, B=2]", "B"},  //9
                {"{0, 1, 3, 4}", "{0, 1, 2, 4}", "{0, 1, 2, 3, 4}", "{0, 0, 0, 3, 4}", "A"},  //10
                {"set", "EventListner", "Comparator", "Collection", "D"},  //11
                {"Set", "List", "Comparator", "Collection", "B"},  //12
                {"List", "Set", "SortedMap", "SortedList", "D"},  //13
                {"Set", "List", "Array", "Collection", "A"},  //14
                {"Set", "Array", "List", "Collection", "D"},  //15
                {"[A, B, C]", "[1, 2, 3]", "{A=1, B=2, C=3}", "[A=1, B=2, C=3]", "D"},  //16
                {"0", "1", "true", "false", "C"},  //17
                {"12345", "54321", "1234", "5432", "B"},  //18
                {"0", "1", "true", "false", "C"},  //19
                {"{0, 1, 3, 4}", "{0, 1, 2, 4}", "{0, 1, 2, 3, 4}", "{0, 0, 0, 3, 4}", "A"},  //20
                {"max(Collection c)", "max(Collection c, Comparator comp)", "max(Comparator comp)", "max(List c)", "C"},  //21
                {"set()", "fill()", "Complete()", "add()", "B"},  //22
                {"rand()", "randomize()", "shuffle()", "ambigous()", "C"},  //23
                {"SetList()", "ConvertList()", "singletonList()", "CopyList()", "C"},  //24
                {"unmodifiableCollection() returns a collection that cannot be modified.", "unmodifiableCollection() method is available only for List and Set.", "unmodifiableCollection() is defined in Collection class.", "None of the mentioned.", "B"},  //25
                {"EMPTY_SET", "EMPTY_LIST", "EMPTY_MAP", "All of the mentioned", "D"},  //26
                {"2 8 5 1", "1 5 8 2", "2", "2 1 8 5", "A"},  //27
                {"2 8 5 1", "1 5 8 2", "2", "2 1 8 5", "B"},  //28
                {"2 8 5 1", "1 5 8 2", "1 2 5 8", "2 1 8 5", "C"},  //29
                {"2 8 5 1", "1 5 8 2", "1 2 5 8", "Any random order", "D"},  //30
                {"Integer", "Double", "Boolean", "Collections Object", "C"},  //31
                {"start()", "begin()", "iteratorSet()", "iterator()", "D"},  //32
                {"next()", "move()", "shuffle()", "hasNext()", "A"},  //33
                {"Setiterator", "ListIterator", "Literator", "None of the mentioned", "B"},  //34
                {"previous()", "previousIndex()", "back()", "goBack()", "B"},  //35
                {"IOException", "SystemException", "ObjectNotFoundExeception", "IllegalStateException", "D"},  //36
                {"0", "1", "-1", "EMPTY", "D"},  //37
                {"2 8 5 1", "1 5 8 2", "2", "2 1 8 5", "B"},  //38
                {"2 8 5 1", "1 5 8 2", "1 2 5 8", "2 1 8 5", "C"},  //39
                {"2 8 5", "2 1 8", "2 5 8", "8 5 1", "B"},  //40
                {"TimeZone", "Locale", "Date", "SimpleTimeZone", "B"},  //41
                {"UK", "US", "INDIA", "KOREA", "C"},  //42
                {"Locale", "Rand", "Random", "None of the mentioned", "C"},  //43
                {"getCountry()", "whichCountry()", "DisplayCountry()", "getDisplayCountry()", "D"},  //44
                {"retbool()", "getBool()", "nextBool()", "nextBoolean()", "D"},  //45
                {"IOException", "SystemException", "ObjectNotFoundExeception", "IllegalStateException", "D"},  //46
                {"India", "INDIA", "Compilation Error", "Nothing is displayed", "D"},  //47
                {"India", "INDIA", "Compilation Error", "Nothing is displayed", "B"},  //48
                {"India", "INDIA", "HINDI", "Nothing is displayed", "C"},  //49
                {"India", "INDIA", "HINDI", "Nothing is displayed", "C"},  //50
                {"It is used to create global subclasses", "It is used to create classes that other part of program can observe.", "It is used to create classes that can be accessed by other parts of program.", "It is used to create methods that can be accessed by other parts of program.", "B"},  //51
                {"update()", "notify()", "check()", "observed()", "A"},  //52
                {"notify()", "observeObject()", "updateObserver()", "notifyObserver()", "D"},  //53
                {"setChanged()", "update()", "notifyObserver()", "All of the mentioned", "D"},  //54
                {"Thread", "Timer", "System", "Observer", "B"},  //55
                {"Runnable", "Thread", "Observer", "ThreadCount", "A"},  //56
                {"java.lang", "java.io", "java.util.zip", "java.util.zar", "C"},  //57
                {"India", "INDIA", "Compilation Error", "Nothing is displayed", "B"},  //58
                {"India", "INDIA", "HINDI", "Nothing is displayed", "C"},  //59
                {"India", "INDIA", "HINDI", "Nothing is displayed", "C"},  //60
                {"Integer class", "Float class", "Primitive Types", "Collections", "C"},  //61
                {"Integer instance.", "Generic class instance.", "Generic type instance.", "Collection instances.", "C"},  //62
                {"Array", "List", "Map", "Set", "A"},  //63
                {"catch", "throw", "throws", "All of the mentioned", "D"},  //64
                {"Oveloaded Methods", "Generic methods", "Class methods", "Overriding methods", "A"},  //65
                {"10", "Box #0 [10]", "Box contains [10]", "Box #0 contains [10]", "D"},  //66
                {"Error", "Hello", "36", "Hello 36", "D"},  //67
                {"5.0", "7.0", "8.0", "6.0", "B"},  //68
                {"1", "2", "3", "6", "A"},  //69
                {"H", "Hello", "Runtime Error", "Compilation Error", "D"},  //70
                {"?", "!", "%", "&", "A"},  //71
                {"It is used in cases when type being operated upon is not known.", "It is used to make code more readable.", "It is used to access members of super class.", "It is used for type argument of generic method", "A"},  //72
                {"stop", "bound", "extends", "implements", "C"},  //73
                {"List", "List", "List(? extends Number)", "List(? UpperBounds Number)", "A"},  //74
                {"Generics provide type safety by shifting more type checking responsibilities to the compiler.", "Generics and parameterized types eliminate the need for down casts when using Java Collections.", "When designing your own collections class (say, a linked list), generics and parameterized types allow you to achieve type safety with just a single class definition as opposed to defining multiple classes.", "All of the mentioned", "C"},  //75
                {"extends", "super", "class", "lower", "B"},  //76
                {"0", "4", "5.0", "6.0", "D"},  //77
                {"5.0", "7.0", "8.0", "6.0", "B"},  //78
                {"1", "2", "3", "6", "A"},  //79
                {"H", "Hello", "Runtime Error", "Compilation Error", "D"},  //80
                {"Recursion is a class.", "Recursion is a process of defining a method that calls other methods repeatedly.", "Recursion is a process of defining a method that calls itself repeatedly.", "Recursion is a process of defining a method that calls other methods which in turn call again this method.", "B"},  //81
                {"Array", "Stack", "Queue", "Tree", "B"},  //82
                {"An infinite loop occurs", "System stops the program after some time.", "After 1000000 calls it will be automatically stopped.", "None of the mentioned", "A"},  //83
                {"A recursive method must have a base case.", "Recursion always uses stack.", "Recursive methods are faster that programmers written loop to call the function repeatedly using a stack.", "Recursion is managed by Java’s Run – Time environment.", "D"},  //84
                {"java.lang", "java.util", "java.io", "java.system", "A"},  //85
                {"0", "1", "Compilation Error", "Runtime Error", "D"},  //86
                {"0", "1", "120", "None of the mentioned", "B"},  //87
                {"24", "30", "120", "720", "C"},  //88
                {"1", "30", "120", "Runtime Error", "A"},  //89
                {"1", "30", "120", "720", "D"},  //90
                {"main().", "recursive() method.", "Any method.", "System defined methods.", "A"},  //91
                {"Array", "Stack", "String", "Integer", "C"},  //92
                {"Infinite", "Only 1", "System Dependent", "None of the mentioned", "A"},  //93
                {"args is a String.", "args is a Character.", "args is an array of String.", "args in an array of Character.", "C"},  //94
                {"Yes", "No", "Compiler Dependent", "Only ASCII characters can be converted.", "B"},  //95
                {"java", "Oupput", "This", "is", "C"},  //96
                {"java", "is", "This", "command", "D"},  //97
                {"This", "java Output This is a command Line", "This is a command Line", "Compilation Error", "C"},  //98
                {"java", "10", "20", "b", "C"},  //99
                {"java", "10", "b", "N", "D"}, //100
                {"abst", "abstract", "Abstract", "abstract class", "B"},  //101
                {"Thread", "AbstractList", "List", "None of the Mentioned", "A"},  //102
                {"abstract", "A simple class", "Static class", "None of the mentioned", "A"},  //103
                {"Every class containing abstract method must be declared abstract.", "Abstract class defines only the structure of the class not its implementation.", "Abstract class can be initiated by new operator.", "Abstract class can be inherited.", "C"},  //104
                {"java.lang", "java.util", "java.io", "java.system", "A"},  //105
                {"2 2", "3 3", "Runtime Error", "Compilation Error", "D"},  //106
                {"1 2", "2 1", "Runtime Error", "Compilation Error", "A"},  //107
                {"0", "2", "Runtime Error", "Compilation Error", "B"},  //108
                {"0", "1", "2", "Compilation Error", "C"},  //109
                {"1 2", "2 1", "1 3", "3 1", "A"},  //110
                {"It allows us to manually handle the exception.", "It allows to fix errors.", "It prevents automatic terminating of the program in cases when an exception occurs.", "All of the mentioned.", "D"},  //111
                {"try", "catch", "throw", "check", "A"},  //112
                {"try", "catch", "throw", "check", "B"},  //113
                {"try", "catch", "throw", "check", "C"},  //114
                {"try block need not to be followed by catch block.", "try block can be followed by finally block instead of catch block.", "try can be followed by both catch and finally block.", "try need not to be followed by anything.", "D"},  //115
                {"Hello", "World", "HelloWOrld", "Compilation Error", "B"},  //116
                {"Hello", "World", "HelloWOrld", "Compilation Error", "A"},  //117
                {"Hello", "World", "HelloWOrld", "Compilation Error", "D"},  //118
                {"Hello", "World", "HelloWorld", "Compilation Error", "C"},  //119
                {"Hello", "World", "HelloWOrld", "WorldWorld", "D"},  //120
                {"Exception", "Trowable", "Abstract", "System", "A"},  //121
                {"getException()", "getMessage()", "obtainDescription()", "obtainException()", "B"},  //122
                {"obtainStackTrace()", "printStackTrace()", "getStackTrace()", "displayStackTrace()", "B"},  //123
                {"getLocalizedMessage()", "getMessage()", "obtainLocalizedMessage()", "printLocalizedMessage()", "A"},  //124
                {"Throwable", "System", "RunTime", "Class", "A"},  //125
                {"3", "Exception", "Runtime Error", "Compilation Error", "B"},  //126
                {"3", "Exception", "Runtime Error", "Compilation Error", "C"},  //127
                {"A", "B", "Compilation Error", "Runtime Error", "D"},  //128
                {"3", "Exception", "Runtime Error", "Compilation Error", "B"},  //129
                {"TypeA", "TypeB", "Compilation Error", "Runtime Error", "C"},  //130
                {"Generics make code more fast.", "Generics make code more optimised and readable.", "Generics add stability to your code by making more of your bugs detectable at compile time.", "Generics add stability to your code by making more of your bugs detectable at run time.", "C"},  //131
                {"K", "N", "T", "V", "C"},  //132
                {"K", "N", "T", "V", "B"},  //133
                {"class name(T1, T2, …, Tn) { /* … */ }", "class name { /* … */ }", "class name[T1, T2, …, Tn] { /* … */ }", "class name{T1, T2, …, Tn} { /* … */ }", "B"},  //134
                {"Generics provide type safety by shifting more type checking responsibilities to the compiler.", "Generics and parameterized types eliminate the need for down casts when using Java Collections.", "When designing your own collections class (say, a linked list), generics and parameterized types allow you to achieve type safety with just a single class definition as opposed to defining multiple classes.", "All of the mentioned", "C"},  //135
                {"Anonymous inner class", "Interface", "Inner class", "All of the mentioned", "A"},  //136
                {"H", "Hello", "Runtime Error", "Compilation Error", "B"},  //137
                {"0", "36", "Runtime Error", "Compilation Error", "B"},  //138
                {"Error", "Hello", "36", "Hello 36", "D"},  //139
                {"H", "Hello", "Runtime Error", "Compilation Error", "D"},  //140
                {"Generic methods are the methods defined in a generic class.", "Generic methods are the methods that extend generic class’s methods.", "Generic methods are methods that introduce their own type parameters.", "Generic methods are methods that take void parameters.", "C"},  //141
                {"K", "N", "T", "V", "C"},  //142
                {"K", "N", "T", "V", "B"},  //143
                {" name(T1, T2, …, Tn) { /* … */ }", "public name { /* … */ }", "class name[T1, T2, …, Tn] { /* … */ }", "name{T1, T2, …, Tn} { /* … */ }", "B"},  //144
                {"Generics provide type safety by shifting more type checking responsibilities to the compiler.", "Generics and parameterized types eliminate the need for down casts when using Java Collections.", "When designing your own collections class (say, a linked list), generics and parameterized types allow you to achieve type safety with just a single class definition as opposed to defining multiple classes.", "All of the mentioned", "C"},  //145
                {"Type Interface", "Interface", "Inner class", "All of the mentioned", "A"},  //146
                {"H", "Hello", "Runtime Error", "Compilation Error", "B"},  //147
                {"0", "36", "Runtime Error", "Compilation Error", "B"},  //148
                {"Error", "Hello", "36", "Hello 36", "D"},  //149
                {"H", "Hello", "Runtime Error", "Compilation Error", "D"},  //150
                {"Generics make code more fast.", "Generics make code more optimised and readable.", "Generics add stability to your code by making more of your bugs detectable at compile time.", "Generics add stability to your code by making more of your bugs detectable at run time.", "C"},  //151
                {"K", "N", "T", "V", "C"},  //152
                {"K", "N", "T", "V", "B"},  //153
                {"class name(T1, T2, …, Tn) { /* … */ }", "class name { /* … */ }", "class name[T1, T2, …, Tn] { /* … */ }", "class name{T1, T2, …, Tn} { /* … */ }", "B"},  //154
                {"Generics provide type safety by shifting more type checking responsibilities to the compiler.", "Generics and parameterized types eliminate the need for down casts when using Java Collections.", "When designing your own collections class (say, a linked list), generics and parameterized types allow you to achieve type safety with just a single class definition as opposed to defining multiple classes.", "All of the mentioned", "C"},  //155
                {"Anonymous inner class", "Interface", "Inner class", "All of the mentioned", "A"},  //156
                {"10", "Box #0 [10]", "Box contains [10]", "Box #0 contains [10]", "D"},  //157
                {"0", "1", "[1]", "[0]", "D"},  //158
                {"Error", "Hello", "36", "Hello 36", "D"},  //159
                {"10", "Box #0 [10]", "Box contains [10]", "Box #0 contains [10]", "D"},  //160
                {"IOException", "SystemException", "SecurityException", "InputOutputException", "B"}, //161
                {"gc()", "garbage()", "garbagecollection()", "Systemgarbagecollection()", "A"}, //162
                {"load()", "library()", "loadlib()", "loadlibrary()", "A"}, //163
                {"setStream()", "setosteam()", "setOut()", "streamtoOstream()", "C"}, //164
                {"0", "1", "2", "3", "A"}, //165
                {"0", "1", "1000", "System Dependent", "D"}, //166
                {"ABCDEF ABCDEF", "ABCDEF GHIJKL", "GHIJKL ABCDEF", "GHIJKL GHIJKL", "A"}, //167
                {"ABCDEF ABCDEF", "ABCDEF GHIJKL", "ABCDEF GHIABC", "GHIJKL GHIJKL", "C"}, //168
                {"ABCDEF ABCDEF", "ABCDEF GHIJKL", "ABCDEF GHIABC", "ABCDEF GHICDL", "D"}, //169
                {"0", "1", "4", "5", "D"} //170

        };

        return qst_options;
    }

}
