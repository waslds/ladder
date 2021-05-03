package ladder;

class Ladder {

	private Row[] rows;
	
	Ladder(NaturalNumber height, NaturalNumber noOfPerson) {
		rows = new Row[height.getNumber()];
		for (int i = 0; i < height.getNumber(); i++) {
			rows[i] = new Row(noOfPerson);
		}
	}
	
	void drawLine(NaturalNumber height, NaturalNumber startPosition) {
		int heightIndex = height.toArrayIndex();
		if (heightIndex > rows.length - 1) {
			throw new IllegalArgumentException(String.format("사다리 최대 높이를 넘어섰습니다. 현재 값은 : %d", height));
		}
		
		rows[heightIndex].drawLine(startPosition);
	}
	
	Marker run(Marker nthOfPerson) {
		for (int i = 0; i < rows.length; i++) {
			Row row = rows[i];
			nthOfPerson = row.move(nthOfPerson);
		}
		
		return nthOfPerson;
	}
	
}
