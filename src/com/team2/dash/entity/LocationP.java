package com.team2.dash.entity;

import android.text.format.DateFormat;

public class LocationP {
	int		_id;			// primary key
	int		workout_id;		// 
	long 	time;			// real time of the reading
	int		workoutTime;	// time since workout started excluding breaks
	double	latitude;
	double 	longtitude;
	double	altitude;
	
	public LocationP( int _id, int workout_id, long time, int workoutTime, double latitude, 
			double longtitude, double altitude){
		this._id = _id;
		this.workout_id = workout_id;
		this.time = time;
		this.workoutTime = workoutTime;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.altitude = altitude;
	}
	
    @Override
	public String toString(){
    	
		String txt = DateFormat.format("dd/MM/yy h:mm:ssaa ", time).toString();
		txt += ", ";
		txt += Integer.toString((int)workoutTime);
		return (txt);
	}
	
	public int getID(){
		return	this._id;
	}
	public void setID( int _id ){
		this._id = _id;
	}

	public int getWorkoutID(){
		return	this.workout_id;
	}
	public void setWorkoutID( int workout_id ){
		this.workout_id = workout_id;
	}

	public long getTime(){
		return	this.time;
	}
	public void setTime( int time ){
		this.time = time;
	}

	public int getWorkoutTime(){
		return	this.workoutTime;
	}
	public void setWorkoutTime( int workoutTime ){
		this.workoutTime = workoutTime;
	}

	public double getLatitude(){
		return	this.latitude;
	}
	public void setLatitude( double latitude ){
		this.latitude = latitude;
	}

	public double getLongtitude(){
		return	this.longtitude;
	}
	public void setLongtitude( double longtitude ){
		this.longtitude = longtitude;
	}

	public double getAltitude(){
		return	this.altitude;
	}
	public void setAltitude( double altitude ){
		this.altitude = altitude;
	}


}