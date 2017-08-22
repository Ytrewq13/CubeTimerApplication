package mycubetimer.cubies;

public abstract class Cubie {
	// This is the superclass.
	// Included to show inheritance and polymorphism.

	protected int[] coords;
	protected String color;
	// To store colors:
	// I will use 'Color' cubies

	public void moveTo(int[] coords) {
		this.coords = coords;
	}

	public int[] getCoords() {
		return this.coords;
	}

	public void testCoords() {
		System.out.println("(" + this.coords[0] + "," + this.coords[1] + "," + this.coords[2] + ")");
	}

	public String getColor() {
		return this.color;
	}
	
	public int[] getNewCoordsAfterMove(char move) {
		// This is going to be a long one...
		switch (move) {
			case 'r':
				if (this.coords[0] < 1) {
					return this.coords;
				}
				switch (this.coords[0]) {
					case 1:
						switch (this.coords[1]) {
							case -2:
								switch (this.coords[2]) {
									case -1:
										// RDB(D) -> RDF(F)
										return new int[] {1,-1,2};
									case 0:
										// RD(D) -> RF(F)
										return new int[] {1,0,2};
									case 1:
										// RDF(D) -> RUF(F)
										return new int[] {1,1,2};
								}
							case -1:
								switch (this.coords[2]) {
									case -2:
										// RDB(B) -> RDF(D)
										return new int[] {1,-2,1};
									case -1:
										// RDB -> RDF
										return new int[] {1,-1,1};
									case 0:
										// RD -> RF
										return new int[] {1,0,1};
									case 1:
										// RDF -> RUF
										return new int[] {1,1,1};
									case 2:
										// RDF(F) -> RUF(U)
										return new int[] {1,2,1};
								}
							case 0:
								switch (this.coords[2]) {
									case -2:
										// RB(B) -> RD(D)
										return new int[] {1,-2,0};
									case -1:
										// RB -> RD
										return new int[] {1,-1,0};
									case 1:
										// RF -> RU
										return new int[] {1,1,0};
									case 2:
										// RF(F) -> RU(U)
										return new int[] {1,2,0};
								}
							case 1:
								switch (this.coords[2]) {
									case -2:
										// RUB(B) -> RDB(D)
										return new int[] {1,-2,-1};
									case -1:
										// RUB -> RDB
										return new int[] {1,-1,-1};
									case 0:
										// RU -> RB
										return new int[] {1,0,-1};
									case 1:
										// RUF -> RUB
										return new int[] {1,1,-1};
									case 2:
										// RUF(F) -> RUB(U)
										return new int[] {1,2,-1};
								}
							case 2:
								switch (this.coords[2]) {
									case -1:
										// RUB(U) -> RDB(B)
										return new int[] {1,-1,-2};
									case 0:
										// RU(U) -> RB(B)
										return new int[] {1,0,-2};
									case 1:
										// RUF(U) -> RUB(B)
										return new int[] {1,1,-2};
								}
						}
					case 2:
						switch (this.coords[1]) {
							case -1:
								switch (this.coords[2]) {
									case -1:
										// RDB(R) -> RDF(R)
										return new int[] {2,-1,1};
									case 0:
										// RD(R) -> RF(R)
										return new int[] {2,0,1};
									case 1:
										// RDF(R) -> RUF(R)
										return new int[] {2,1,1};
								}
							case 0:
								switch (this.coords[2]) {
									case -1:
										// RB(R) -> RD(R)
										return new int[] {2,-1,0};
									case 1:
										// RF(R) -> RU(R)
										return new int[] {2,1,0};
								}
							case 1:
								switch (this.coords[2]) {
									case -1:
										// RUB(R) -> RDB(R)
										return new int[] {2,-1,-1};
									case 0:
										// RU(R) -> RB(R)
										return new int[] {2,0,-1};
									case 1:
										// RUF(R) -> RUB(R)
										return new int[] {2,1,-1};
								}
						}
				}
			case 'u':
				if (this.coords[1] < 1) {
					return this.coords;
				}
				switch (this.coords[1]) {
					case 1:
						switch (this.coords[0]) {
							case -2:
								switch (this.coords[2]) {
									case -1:
										// LUB(L) -> RUB(B)
										return new int[] {1,1,-2};
									case 0:
										// LU(L) -> UB(B)
										return new int[] {0,1,-2};
									case 1:
										// LUF(L) -> LUB(B)
										return new int[] {-1,1,-2};
								}
							case -1:
								switch (this.coords[2]) {
									case -2:
										// LUB(B) -> RUB(R)
										return new int[] {2,1,-1};
									case -1:
										// LUB -> RUB
										return new int[] {1,1,-1};
									case 0:
										// LU -> UB
										return new int[] {0,1,-1};
									case 1:
										// LUF -> LUB
										return new int[] {-1,1,-1};
									case 2:
										// LUF(F) -> LUB(L)
										return new int[] {-2,1,-1};
								}
							case 0:
								switch (this.coords[2]) {
									case -2:
										// UF(F) -> UL(L)
										return new int[] {-2,1,0};
									case -1:
										// UF -> UL
										return new int[] {-1,1,0};
									case 1:
										// UB -> UR
										return new int[] {1,1,0};
									case 2:
										// UB(B) -> UR(R)
										return new int[] {2,1,0};
								}
							case 1:
								switch (this.coords[2]) {
									case -2:
										// RUB(B) -> RUF(R)
										return new int[] {2,1,1};
									case -1:
										// RUB -> RUF
										return new int[] {1,1,1};
									case 0:
										// RU -> UF
										return new int[] {0,1,1};
									case 1:
										// RUF -> LUF
										return new int[] {-1,1,1};
									case 2:
										// RUF(F) -> LUF(L)
										return new int[] {-2,1,1};
								}
							case 2:
								switch (this.coords[2]) {
									case -1:
										// RUB(R) -> RUF(F)
										return new int[] {1,1,2};
									case 0:
										// RU(R) -> UF(F)
										return new int[] {0,1,2};
									case 1:
										// RUF(R) -> LUF(F)
										return new int[] {-1,1,2};
								}
						}
					case 2:
						switch (this.coords[0]) {
							case -1:
								switch (this.coords[2]) {
									case -1:
										// LUB(U) -> RUB(U)
										return new int[] {1,2,-1};
									case 0:
										// LU(U) -> UB(U)
										return new int[] {0,2,-1};
									case 1:
										// LUF(U) -> LUB(U)
										return new int[] {-1,2,-1};
								}
							case 0:
								switch (this.coords[2]) {
									case -1:
										// UB(U) -> RU(U)
										return new int[] {1,2,0};
									case 1:
										// UF(U) -> LU(U)
										return new int[] {-1,2,0};
								}
							case 1:
								switch (this.coords[2]) {
									case -1:
										// RUB(U) -> RUF(U)
										return new int[] {1,2,1};
									case 0:
										// RU(U) -> UF(U)
										return new int[] {0,2,1};
									case 1:
										// RUF(U) -> LUF(U)
										return new int[] {-1,2,1};
								}
						}
				}
			case 'f':
				if (this.coords[2] < 1) {
					return this.coords;
				}
				switch (this.coords[2]) {
					case 1:
						switch (this.coords[0]) {
							case -2:
								switch (this.coords[1]) {
									case -1:
										// LDF(L) -> LUF(U)
										return new int[] {-1,2,1};
									case 0:
										// LF(L) -> UF(U)
										return new int[] {0,2,1};
									case 1:
										//LUF(L) -> RUF(U)
										return new int[] {1,2,1};
								}
							case -1:
								switch (this.coords[1]) {
									case -2:
										// LDF(D) -> LUF(L)
										return new int[] {-2,1,1};
									case -1:
										// LDF -> LUF
										return new int[] {-1,1,1};
									case 0:
										// LF -> UF
										return new int[] {0,1,1};
									case 1:
										// LUF -> RUF
										return new int[] {1,1,1};
									case 2:
										// LUF(U) -> RUF(R)
										return new int[] {2,1,1};
								}
							case 0:
								switch (this.coords[1]) {
									case -2:
										// DF(D) -> LF(L)
										return new int[] {-2,0,1};
									case -1:
										// DF -> LF
										return new int[] {-1,0,1};
									case 1:
										// UF -> RF
										return new int[] {1,0,1};
									case 2:
										// UF(U) -> RF(U)
										return new int[] {2,0,1};
								}
							case 1:
								switch (this.coords[1]) {
									case -2:
										// RDF(D) -> LDF(L)
										return new int[] {-2,-1,1};
									case -1:
										// RDF -> LDF
										return new int[] {-1,-1,1};
									case 0:
										// RF -> DF
										return new int[] {0,-1,1};
									case 1:
										// RUF -> RDF
										return new int[] {1,-1,1};
									case 2:
										// RUF(U) -> RDF(R)
										return new int[] {2,-1,1};
								}
							case 2:
								switch (this.coords[1]) {
									case -1:
										// RDF(R) -> LDF(D)
										return new int[] {-1,-2,1};
									case 0:
										// RF(R) -> DF(D)
										return new int[] {0,-2,1};
									case 1:
										// RUF(R) -> RDF(D)
										return new int[] {1,-2,1};
								}
						}
					case 2:
						switch (this.coords[0]) {
							case -1:
								switch (this.coords[1]) {
									case -1:
										// LDF(F) -> LUF(F)
										return new int[] {-1,1,2};
									case 0:
										// LF(F) -> UF(F)
										return new int[] {0,1,2};
									case 1:
										// LUF(F) -> RUF(F)
										return new int[] {1,1,2};
								}
							case 0:
								switch (this.coords[1]) {
									case -1:
										// DF(F) -> LF(F)
										return new int[] {-1,0,2};
									case 1:
										// UF(F) -> RF(F)
										return new int[] {1,0,2};
								}
							case 1:
								switch (this.coords[1]) {
									case -1:
										// RDF(F) -> LDF(F)
										return new int[] {-1,-1,2};
									case 0:
										// RF(F) -> DF(F)
										return new int[] {0,-1,2};
									case 1:
										// RUF(F) -> RDF(F)
										return new int[] {1,-1,2};
								}
						}
				}
			// This is taking soooooooo long...
			case 'b':
				if (this.coords[2] > -1) {
					return this.coords;
				}
			
			default:
				// Something is wrong with the above list.
				return new int[] {0,0,0};
		}
	}

}
