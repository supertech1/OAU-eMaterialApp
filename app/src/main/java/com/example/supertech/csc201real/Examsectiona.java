package com.example.supertech.csc201real;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
public class Examsectiona extends Fragment implements AdapterView.OnItemClickListener {

    GridView examsectionagridview;
    static String qst_nos[] = {};
    static String[] section_a_content = {}; //holds question
    static String[] section_a_solution = {};  //holds solution

    public Examsectiona() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_examsectiona, container, false);



        examsectionagridview = (GridView)v.findViewById(R.id.examsectionagridview);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(getActivity(), R.layout.simple_list_item_1,getQst_nos());
        examsectionagridview.setAdapter(aa);
        examsectionagridview.setOnItemClickListener(this);

        return v;

    }

    public void set_qst_nos(String qst_nos[])
    {
        Examsectiona.qst_nos = qst_nos;
    }

    public String[] getQst_nos()
    {
        return Examsectiona.qst_nos;
    }

    public void set_Section_A_Content(String[] s)
    {
        section_a_content = s;
    }

    public String[] get_Section_A_Content() {
        return section_a_content;
    }

    public void set_Section_A_Solution(String[] s)
    {
        section_a_solution = s;
    }

    public String[] get_Section_A_Solution()
    {
        return section_a_solution;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        String[] section_a_content = get_Section_A_Content();
        String[] section_a_solution = get_Section_A_Solution();

        Bundle bundle = getActivity().getIntent().getExtras();
        String title = bundle.getString("title");
        int selected = position+1;
        Intent intent = new Intent(getActivity(),PQSolutions.class);

        String examqst = section_a_content[selected];
        String examsolution = section_a_solution[selected];
        intent.putExtra("qst_nos",qst_nos);
        intent.putExtra("testqst",examqst);
        intent.putExtra("testsolution", examsolution);
        intent.putExtra("position_from_grid",selected);

        intent.putExtra("yeartestqst", section_a_content);   //using the same format as test seesion
        intent.putExtra("yeartestsolution", section_a_solution);

        intent.putExtra("title",title);
        getActivity().startActivity(intent);

    }
}
