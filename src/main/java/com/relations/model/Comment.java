package com.relations.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Comment extends BaseEntity {
	@Column(nullable = false)
	private String texte;
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="post_ref")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Post post;
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}

}
