package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class PortalUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3928078962030202335L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_portal_user")
	private Integer id;

	@Column(name="nm_user")
	private String nome_user;
	
	@Column(name="nm_email")
	private String email;
	
	@Column(name="nr_cpf")
	private String cpf;

	public PortalUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PortalUser(Integer id, String nome_user, String email, String cpf) {
		super();
		this.id = id;
		this.nome_user = nome_user;
		this.email = email;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome_user() {
		return nome_user;
	}

	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PortalUser [id=" + id + ", nome_user=" + nome_user + ", email=" + email + ", cpf=" + cpf + "]";
	}
		
}
