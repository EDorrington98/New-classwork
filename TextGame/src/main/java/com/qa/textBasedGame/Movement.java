package com.qa.textBasedGame;
	public enum Movement implements Player {
		NORTH (playY + 1),
		SOUTH (playY -1),
		EAST (playX +1),
		WEST (playX -1);
		 private int direction;
		 Movement (int direction) {
			this.setDirection(direction);
					}
		public int getDirection() {
			return direction;
		}
		public void setDirection(int direction) {
			this.direction = direction;
		}
}
