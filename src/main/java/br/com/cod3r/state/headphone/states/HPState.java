package br.com.cod3r.state.headphone.states;

import br.com.cod3r.state.headphone.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
