package it.unibo.mmw.distsys.services;

import it.unibo.mmw.distsys.models.Member;
import jakarta.ejb.Stateless;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.logging.Logger;

@Stateless
public class MemberRegistration {

	@Inject
	private Logger log;

	@Inject
	private EntityManager em;

	@Inject
	private Event<Member> memberEventSrc;

	public void register(Member member) {
		log.info("Registering " + member.getName());
		em.persist(member);
		memberEventSrc.fire(member);
	}
}
