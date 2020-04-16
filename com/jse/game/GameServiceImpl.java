package com.jse.game;

public class GameServiceImpl implements GameService {
	public Game[] game;

	public GameServiceImpl() {
		game = new Game[3];
		this.game = game;
	}
	@Override
	public void add(Game game) {
		
	}
	public Game[] list() {
		return game;
	}
	@Override
	public Game detail(Game game) {
		return null;
	}
	@Override
	public int count() {
		return 0;
	}

	@Override
	public void update(Game game) {
	}
	@Override
	public void delete(Game game) {
	}

}
