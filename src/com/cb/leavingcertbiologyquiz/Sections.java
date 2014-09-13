package com.cb.leavingcertbiologyquiz;

import java.io.File;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.cb.leavingcertbiologyquiz.R;

public class Sections extends Activity {

	private Button ecology;
	private Button food;
	private Button cell;
	private Button cell_continuity;
	private Button enzymes;
	private Button dna;
	private Button bacteria;
	private Button plants;
	private Button heart;
	private Button nutrition_excretion;
	private Button nervous;
	private Button senses;
	private Button defence;
	private Button humanrepro;
	private Button plantrepro;
	private Button growthresponse;
	
	private int numberQuestions;
	private RadioButton number_of_questions;
	
	private RadioGroup group;

	
	public SoundPool sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);

	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sections);
		init();
		
	}
	
	public void init(){
		final int soundId = sp.load(this, R.raw.click, 1); 
		food = (Button)findViewById(R.id.bfood);
		enzymes = (Button)findViewById(R.id.benzymes);
		ecology = (Button)findViewById(R.id.becology);
		cell = (Button)findViewById(R.id.bcell);
		cell_continuity = (Button)findViewById(R.id.bcellcontinuity);
		dna = (Button)findViewById(R.id.bdna);
		bacteria = (Button)findViewById(R.id.bmicro);
		plants = (Button)findViewById(R.id.bplantsstructure);
		heart =(Button)findViewById(R.id.bheart);
		nutrition_excretion =(Button)findViewById(R.id.bnutrition);
		nervous =(Button)findViewById(R.id.bskeleton);
		senses =(Button)findViewById(R.id.bsense);
		defence =(Button)findViewById(R.id.bdefence);
		humanrepro =(Button)findViewById(R.id.breproduction);
		plantrepro =(Button)findViewById(R.id.bplantrepro);
		growthresponse =(Button)findViewById(R.id.bgrowthresponse);
		
		group = (RadioGroup)findViewById(R.id.radioGroup2);
		
		if(doesDatabaseExist(this, Database.DATABASE_NAME)==false){	
			
			System.out.println("MAKING DATABASE");
			
			Database Db = new Database(this);
			Db.open();
			Db.addQuestions();
			
			Db.close();

		}
		
		else{
			
			System.out.println("DATABASE Exists apparently");
			
		}
	
		
		
		food.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(30, 1);
			}});
				
		ecology.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(78, 31);
			}});
		

		cell.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(95, 79);
			}});
			
		cell_continuity.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(117,96);
			}});
		
		enzymes.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(137, 118);
			
			}});
		
		dna.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(190, 138);
			
			}});
		
		bacteria.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(221, 189);
			
			}});
		
		plants.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(245, 222);
			
			}});
		
		heart.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(269, 246);
			
			}});
		
		nutrition_excretion.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(313, 270);
			
			}});
		nervous.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(359, 314);
			
			}});
		senses.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(386, 360);
			
			}});
		defence.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(405, 387);
			}});
		growthresponse.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(421, 406);				
			}});
		humanrepro.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(460, 422);
			
			}});
		plantrepro.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				sp.play(soundId, 1, 1, 0, 0, 1);
				startQuiz(477, 461);
			
			}});
	
		
	}
	
	public void startQuiz(int max, int min){
		
		number_of_questions=(RadioButton)findViewById(group.getCheckedRadioButtonId());

		
		Intent i = new Intent(Sections.this, MainActivity.class);
		i.putExtra("max", max);
		i.putExtra("min", min);
		numberQuestions = Integer.parseInt(number_of_questions.getText().toString());
		i.putExtra("numberQuestions", numberQuestions);
		Bundle bndlanimation = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation, R.anim.animation2).toBundle();
		startActivity(i, bndlanimation);
//		startActivity(i);
		
	}
	
	public void OnBackPressed() {	
		super.onBackPressed();
		overridePendingTransition(R.anim.animation, R.anim.animation2);
	}
	
	private static boolean doesDatabaseExist(ContextWrapper context, String dbName) {
	    File dbFile = context.getDatabasePath(dbName);
	    return dbFile.exists();
	}
}
