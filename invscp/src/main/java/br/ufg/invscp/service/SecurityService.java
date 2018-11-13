package br.ufg.invscp.service;

/**
 * @author Iago Bruno
 * @since 1.0
 */
public interface SecurityService {

  String findLoggedInUsername();

  void autologin(String username, String password);
}
