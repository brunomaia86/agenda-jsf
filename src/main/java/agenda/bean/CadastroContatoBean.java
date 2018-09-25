package agenda.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import agenda.Contato;
import agenda.service.CadastroContatoService;

@Named
@ViewScoped
public class CadastroContatoBean implements Serializable {

	private static final long serialVersionUID = -5243223788303744565L;

	@Inject
	private CadastroContatoService cadastroContatoService;

	private Contato contato = new Contato();
	private List<Contato> listaDeContatos;

	@PostConstruct
	public void init() {
		setListaDeContatos(cadastroContatoService.buscarTodos());
	}

	public void cadastrar() {
		getListaDeContatos().add(contato);
		contato = new Contato();
	}

	/*public void verificarExistenciaDoContato() {
		for (Contato contato : listaDeContatos) {
			if (contato.getCpf().equals(this.contato.getCpf())) {
				FacesContext.getCurrentInstance().addMessage("Contato já existe!!!",
						new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario já existe", "Favor verificar"));
				break;
			}
		}
	}*/

	public List<Contato> getListaDeContatos() {
		return listaDeContatos;
	}

	public void setListaDeContatos(List<Contato> listaDeContatos) {
		this.listaDeContatos = listaDeContatos;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
