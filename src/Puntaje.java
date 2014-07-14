

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eli
 */
public class Puntaje {
    String j1="Jugador 1";
    String j2="Jugador 2";
    
    public String scoreIng(int [] pun, String [] idioma){
        String [] g;
        g = idioma;
        if(pun[0]==0 && pun[1]==0){
        return idioma[0]+("-")+idioma[9];
      	} else {
      	 	if(pun[0]==0 && pun[1]==15){
                    return idioma[0]+("-")+idioma[1];} 
                else {
       	  	if(pun[0]==0 && pun[1]==30){
                    return idioma[0]+("-")+idioma[2];} 
                else {
                if(pun[0]==0 && pun[1]==40){
                    return idioma[0]+("-")+idioma[3];}
                else {
                if(pun[0]==15 && pun[1]==0){
                    return idioma[1]+("-")+idioma[0];} 
                else {
                if(pun[0]==30 && pun[1]==0){
                    return idioma[2]+("-")+idioma[0];}
                else {
                if(pun[0]==40 && pun[1]==0){
                    return idioma[3]+("-")+idioma[0];}
                else {
                if(pun[0]==15 && pun[1]==15){
      	            return idioma[1]+("-")+idioma[9];}
                else {
	        if(pun[0]==15 && pun[1]==30){
	            return idioma[1]+("-")+idioma[2];}
                else {
                if(pun[0]==15 && pun[1]==40){
	            return idioma[1]+("-")+idioma[3];}
                else {                        
                if(pun[0]==30 && pun[1]==15){
                    return idioma[2]+("-")+idioma[1];}
                else {
	        if(pun[0]==40 && pun[1]==15){
                    return idioma[3]+("-")+idioma[1];}
                else {
		if((pun[0]==30 && pun[1]==30)){
                    return idioma[2]+("-")+idioma[9];}
                else {
   		if(pun[0]==30 && pun[1]==40){
                    return idioma[2]+("-")+idioma[3];}
                else {
                if(pun[0]==40 && pun[1]==30){
                    return idioma[3]+("-")+idioma[2];}
                else {
                if((pun[0]==50 && pun[1]==0) || (pun[0]==50 && pun[1]==15) || (pun[0]==50 && pun[1]==30) || (pun[0]==60 && pun[1]==40) || (pun[0]==70 && pun[1]==50) || (pun[0]==80 && pun[1]==60)){
                    return idioma[4];}
                else{
                if((pun[0]==0 && pun[1]==50) || (pun[0]==15 && pun[1]==50) || (pun[0]==30 && pun[1]==50) || (pun[0]==40 && pun[1]==60) || (pun[0]==50 && pun[1]==70) || (pun[0]==60 && pun[1]==80)){
                    return idioma[5];}
                else {
                if((pun[0]==40 && pun[1]==40) || (pun[0]==50 && pun[1]==50) || (pun[0]==60 && pun[1]==60) || (pun[0]==70 && pun[1]==70) || (pun[0]==80 && pun[1]==80)){
                    return idioma[6];}
                else {
                if((pun[0]==50 && pun[1]==40) || (pun[0]==60 && pun[1]==50) || (pun[0]==70 && pun[1]==60)){ 
                    return idioma[7];}
                else {
                if( (pun[0]==40 && pun[1]==50) || (pun[0]==50 && pun[1]==60) || (pun[0]==60 && pun[1]==70)){
                    return idioma[8];}
                    }}}}}}}}}}}}}}}}}}}
        return "¿Quieres volver a jugar?";
    }
        

   
}