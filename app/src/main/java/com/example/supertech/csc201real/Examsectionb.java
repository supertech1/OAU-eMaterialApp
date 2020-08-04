package com.example.supertech.csc201real;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Examsectionb extends Fragment implements AdapterView.OnItemClickListener{


    GridView examsectionbgridview;
    static String qst_nos[] = {};

    static String[] section_b_content = {}; //holds question
    static String[] section_b_solution = {};  //holds solution

    public Examsectionb() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_examsectionb, container, false);

        examsectionbgridview = (GridView)v.findViewById(R.id.examsectionbgridview);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(getActivity(), R.layout.simple_list_item_1,getQst_nos());
        examsectionbgridview.setAdapter(aa);
        examsectionbgridview.setOnItemClickListener(this);


        return v;
    }

    public void set_qst_nos(String qst_nos[])
    {
        Examsectionb.qst_nos = qst_nos;
    }

    public String[] getQst_nos()
    {
        return Examsectionb.qst_nos;
    }

    public void set_Section_B_Content(String[] s)
    {
        section_b_content = s;
    }

    public String[] get_Section_B_Content() {
        return section_b_content;
    }

    public void set_Section_B_Solution(String[] s)
    {
        section_b_solution = s;
    }

    public String[] get_Section_B_Solution()
    {
        return section_b_solution;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        String[] section_b_content = get_Section_B_Content();
        String[] section_b_solution = get_Section_B_Solution();

        Bundle bundle = getActivity().getIntent().getExtras();
        String title = bundle.getString("title");
        int selected = position+1;
        Intent intent = new Intent(getActivity(),PQSolutions.class);

        String examqst = section_b_content[selected];
        String examsolution = section_b_solution[selected];
        String[] sb_qst_nos_formatted = {"1a.","1b.","1c.","2a.","2b.","2c.","3a.","3b.","3c."};
        intent.putExtra("qst_nos",getQst_nos());
        intent.putExtra("testqst",examqst);
        intent.putExtra("testsolution", examsolution);
        intent.putExtra("position_from_grid",selected);

        intent.putExtra("yeartestqst", section_b_content);   //using the same format as test seesion
        intent.putExtra("yeartestsolution", section_b_solution);

        intent.putExtra("title",title);
        getActivity().startActivity(intent);

    }
}
