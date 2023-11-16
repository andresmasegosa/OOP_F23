In this exercise, you have a class *SendDataService* which
simulates a web service to send data to a given server. 


Try to refactor these classes using the **Decorator design 
pattern** to have the possibility of compressing and encrypting
a *String* object before is written to a file. Use the provided
API classes *DataCompressor* and *DataEncryptor* to simulate the
compression and the encryption of a *String* object. 

Hints:

- Refactor the class "SendDataService" as an interface "SendDataService"  with a method "void sendData(String data);" 
   plus a class "SendDataServiceBasic" implementing this interface.
- Define a class "EncryptorDecorator" implementing "SendDataService" and adding the encryption part of the data before
  it is sent. Use the class "DataCompressor" to implement this part. 
- Define a class "CompressorDecorator" implementing "SendDataService" and adding the compression part of the data before
  it is sent. Use the class "DataCompressor" to implement this part. 
