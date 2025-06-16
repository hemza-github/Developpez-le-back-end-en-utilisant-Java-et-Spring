package com.hemza.rental_backend.controller;

import com.hemza.rental_backend.dto.RegisterRequestDTO;
import com.hemza.rental_backend.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Contrôleur REST responsable des opérations d'authentification.
 * Ici, il gère l'enregistrement des utilisateurs.
 */
@RestController
@RequestMapping("/api/auth") // Tous les endpoints de ce contrôleur commenceront par /api/auth
public class AuthController {

  // Injection du service métier qui contient la logique d’enregistrement des
  // utilisateurs
  @Autowired
  private UserService userService;

  /**
   * Endpoint HTTP POST pour enregistrer un nouvel utilisateur.
   *
   * @param request Les données d'inscription envoyées par le client (nom, email,
   *                mot de passe)
   * @return Une réponse HTTP contenant un token si succès, ou un message d'erreur
   *         sinon
   */
  @PostMapping("/register")
  public ResponseEntity<?> register(@RequestBody RegisterRequestDTO request) {
    try {
    // Appel du service métier pour enregistrer l'utilisateur et générer un token
      String token = userService.register(request); // ✅ Utilisation du service sécurisé
      return ResponseEntity.ok(token);
    } catch (IllegalArgumentException e) {
      // 💥 En cas d'erreur (ex : email déjà utilisé), on renvoie un code 400 avec le message
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
