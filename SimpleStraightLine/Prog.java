class Prog {
	static Stm prog = new CompoundStm(
							new AssignStm("a",
									new OpExp(new NumExp(5), OpExp.Plus, new NumExp(3))),
							new CompoundStm(
									new AssignStm("b", 
													new OpExp(new NumExp(10), OpExp.Times, new IdExp("a"))),
									new PrintStm(new IdExp("b"))));
}



