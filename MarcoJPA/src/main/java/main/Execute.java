package main;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import dominio.PortalUser;

import java.util.Collection;

public class Execute {

	@PersistenceContext
	private static EntityManager em;

	public static Collection<PortalUser> lista() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexao_persistencia");
		em = emf.createEntityManager();
		Query query = em.createQuery("SELECT e FROM PortalUser e");
		//Query query = em.createQuery("select id,nome_user,email,cpf from PortalUser");
		return (Collection<PortalUser>) query.getResultList();
	}

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexao_persistencia");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// PortalUser pu = new PortalUser(null, "Marco Antonio 2",
		// "marco.pereira.ext2@sodexo.com", "111.111.111-11");

		// em.persist(pu);

		// PortalUser pu_find = em.find(PortalUser.class, 1);
		//
		// em.remove(pu_find);

		///// PortalUser pu = em.find(PortalUser.class, 3);

		///// System.out.println(pu);

		List<PortalUser> lpu = new LinkedList<PortalUser>();
		// TypedQuery<PortalUser> query = em.createQuery("select id,nome_user,email,cpf
		// from PortalUser", PortalUser.class);

		lpu = em.createQuery("select id,nome_user,email,cpf from PortalUser").getResultList();

		System.out.println(lpu.size());

		// for (Iterator<PortalUser> iterator = lpu.iterator(); iterator.hasNext();) {
		// PortalUser portalUser = (PortalUser) iterator.next();
		// System.out.println(portalUser);
		// System.out.println(1);
		// }

		System.out.println(lista());

		em.getTransaction().commit();

		em.close();

		emf.close();
	}

}
