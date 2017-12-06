package $package$

import org.mindrot.jbcrypt.BCrypt

case class PasswordHash(hash: String) extends AnyVal

package object util {

  def isPasswordCorrect(enteredPass: String, hashedPass: PasswordHash): Boolean = 
    BCrypt.checkpw(enteredPass, hashedPass.hash)

  def hashPassword(pw: String): PasswordHash = PasswordHash(bcryptHash(pw))

  def bcryptHash(s: String, logRounds: Int = 12) =
    BCrypt.hashpw(s, BCrypt.gensalt(logRounds))
}
