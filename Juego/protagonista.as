﻿package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.events.KeyboardEvent;
	import flash.events.TimerEvent;
		import flash.utils.Timer;
	public class protagonista extends MovieClip{
		private var izq: Boolean = false;
		private var der: Boolean = false;
		private var vel: int=10;
		private var lim_x_der: int= 510;
		private var lim_x_izq: int = 40;
		private var lanzar: Timer = new Timer(1000,0);
		private var tipo: Number;
		
		public function protagonista() {
			// constructor code
			addEventListener( Event.ENTER_FRAME, motor);
			lanzar.addEventListener(TimerEvent.TIMER, lanza_bala);
			lanzar.start();
		}
		public function motor(e:Event):void{
			if(der ){
				if(x<=lim_x_der){
					x+= vel;
				}
			} else if (izq){
				if(x>=lim_x_izq){
					x-=vel;
				}
			}

			controles();
		}
		public function controles(){
			stage.addEventListener(KeyboardEvent.KEY_DOWN, keydown);
			stage.addEventListener(KeyboardEvent.KEY_UP, keyup);
		}
		public function keydown (e:KeyboardEvent): void{
			switch (e.keyCode){
				case 68:
				der=true;
				break;
				case 65:
				izq=true;
				break;
			}
		}
		public function keyup (e:KeyboardEvent) : void{
			switch(e.keyCode){
				case 68:
				der=false;
				break;
				case 65:
				izq=false;
				break;
			}
		}
	
	public function lanza_bala(e:TimerEvent){
	var bala_nueva=new bala(x,y);
	stage.addChild(bala_nueva);
}
	}
	
}
