package agenda.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import agenda.Contato;

@ApplicationScoped
public class CadastroContatoService implements Serializable {

	private static final long serialVersionUID = 5630257360427922758L;

	private List<Contato> contatos;

	@PostConstruct
	public void init() {
		contatos = new ArrayList<>();
		contatos.add(new Contato("976272163-20", "Bruno Maia", "988082285"));
		contatos.add(new Contato("000000000-00", "Larissa Lucena", "981572997"));
		contatos.add(new Contato("111111111-11", "Eveline Maia", "996047430"));
		contatos.add(new Contato("222222222-22", "Arlindo", "999822442"));
		contatos.add(new Contato("333333333-33", "Guilherme", "988213746"));
	}

	public List<Contato> buscarTodos() {
		return contatos;
	}
}
