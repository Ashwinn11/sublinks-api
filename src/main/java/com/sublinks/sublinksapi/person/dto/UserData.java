package com.sublinks.sublinksapi.person.dto;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user_data")
public class UserData {

  /**
   * Relationships.
   */
  @ManyToOne
  @JoinColumn(name = "person_id")
  private Person person;

  /**
   * Attributes.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, name = "ip_address")
  private String ipAddress;

  @Column(nullable = true, name = "user_agent")
  private String userAgent;

  @CreationTimestamp
  @Column(updatable = false, nullable = false, name = "created_at")
  private Date createdAt;

  @UpdateTimestamp
  @Column(updatable = true, nullable = false, name = "last_used_at")
  private Date lastUsedAt;
}
