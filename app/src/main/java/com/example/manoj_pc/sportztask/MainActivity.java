package com.example.manoj_pc.sportztask;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.manoj_pc.sportztask.network.ApiClientMain;
import com.example.manoj_pc.sportztask.newmodel.ServerResponse;
import com.example.manoj_pc.sportztask.utils.Constants;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static final String BASE_URL = "https://firebasestorage.googleapis.com/";
    private String teamName1;
    private String teamShortName1;
    private String teamName2;
    private String teamShortName2;
    private String getTeam;
    private TextView tvName;
    private TextView tvStyle;
    private TextView tvAvg;
    private TextView tvStrikeRate;
    private TextView tvRuns;
    private TextView tvBstyle;
    private TextView tvBavg;
    private TextView tvEcoRate;
    private TextView tvWickets;
    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = new ProgressDialog(MainActivity.this);
        getTeam = getIntent().getStringExtra(Constants.TEAM);
        initView();
        initData();
    }

    private void initData() {
        callWebservice();

    }
    private void callWebservice() {
        progress.setIndeterminate(true);
        progress.setMessage("Please wait...");
        progress.show();
        Call<ServerResponse> call= ApiClientMain.getApiClient().register();
        call.enqueue(new retrofit2.Callback<ServerResponse>() {
            @Override
            public void onResponse(Call<ServerResponse> call, Response<ServerResponse> response) {
                if (progress.isShowing())
                    progress.dismiss();
                ServerResponse resp = response.body();
                if (resp != null) {
                    if(getTeam.equals("RCB")){
                        teamName1 = resp.getTeams().getJsonMember1105().getNameFull();
                        teamShortName1 = resp.getTeams().getJsonMember1105().getNameShort();
                        tvName.setText(resp.getTeams().getJsonMember1105().getPlayers().getJsonMember3993().getNameFull());
                        tvStyle.setText("Style:"+resp.getTeams().getJsonMember1105().getPlayers().getJsonMember3993().getBatting().getStyle());
                        tvAvg.setText("Average:"+resp.getTeams().getJsonMember1105().getPlayers().getJsonMember3993().getBatting().getAverage());
                        tvStrikeRate.setText("Strikerate:"+resp.getTeams().getJsonMember1105().getPlayers().getJsonMember3993().getBatting().getStrikerate());
                        tvRuns.setText("Runs:"+resp.getTeams().getJsonMember1105().getPlayers().getJsonMember3993().getBatting().getRuns());

                        tvBstyle.setText("Style:"+resp.getTeams().getJsonMember1105().getPlayers().getJsonMember3993().getBowling().getStyle());
                        tvBavg.setText("Average:"+resp.getTeams().getJsonMember1105().getPlayers().getJsonMember3993().getBowling().getAverage());
                        tvEcoRate.setText("Economyrate:"+resp.getTeams().getJsonMember1105().getPlayers().getJsonMember3993().getBowling().getEconomyrate());
                        tvWickets.setText("Wickets:"+resp.getTeams().getJsonMember1105().getPlayers().getJsonMember3993().getBowling().getWickets());

                    }else {
                        teamName2= resp.getTeams().getJsonMember1379().getNameFull();
                        teamShortName2 = resp.getTeams().getJsonMember1379().getNameShort();
                        tvName.setText(resp.getTeams().getJsonMember1379().getPlayers().getJsonMember5380().getNameFull());
                        tvStyle.setText("Style:"+resp.getTeams().getJsonMember1379().getPlayers().getJsonMember5380().getBatting().getStyle());
                        tvAvg.setText("Average:"+resp.getTeams().getJsonMember1379().getPlayers().getJsonMember5380().getBatting().getAverage());
                        tvStrikeRate.setText("Strikerate:"+resp.getTeams().getJsonMember1379().getPlayers().getJsonMember5380().getBatting().getStrikerate());
                        tvRuns.setText("Runs:"+resp.getTeams().getJsonMember1379().getPlayers().getJsonMember5380().getBatting().getRuns());

                        tvBstyle.setText("Style:"+resp.getTeams().getJsonMember1379().getPlayers().getJsonMember5380().getBowling().getStyle());
                        tvBavg.setText("Average:"+resp.getTeams().getJsonMember1379().getPlayers().getJsonMember5380().getBowling().getAverage());
                        tvEcoRate.setText("Economyrate:"+resp.getTeams().getJsonMember1379().getPlayers().getJsonMember5380().getBowling().getEconomyrate());
                        tvWickets.setText("Wickets:"+resp.getTeams().getJsonMember1379().getPlayers().getJsonMember5380().getBowling().getWickets());
                    }

                }else{
                    Toast.makeText(MainActivity.this,"Something went wrong!!!",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ServerResponse> call, Throwable t) {
                if (progress.isShowing())
                    progress.dismiss();
                Toast.makeText(MainActivity.this, "Please try again", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        tvName = (TextView)findViewById(R.id.tvName);
        tvStyle = (TextView)findViewById(R.id.tvStyle);
        tvAvg = (TextView)findViewById(R.id.tvAvg);
        tvStrikeRate = (TextView)findViewById(R.id.tvStrikeRate);

        tvRuns = (TextView)findViewById(R.id.tvRuns);
        tvBstyle = (TextView)findViewById(R.id.tvBstyle);
        tvBavg = (TextView)findViewById(R.id.tvBavg);
        tvEcoRate = (TextView)findViewById(R.id.tvEcoRate);
        tvWickets = (TextView)findViewById(R.id.tvWickets);

    }
}
