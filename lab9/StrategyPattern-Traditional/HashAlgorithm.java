public interface HashAlgorithm
{
    /**
     * Implementation of hashing algorithm
     *
     * @param       plainText  String to be hashed
     * @return      The hashed string
     */
    String calculateHash(String plainText);
}
