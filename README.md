# Sistemi Distribuiti - Esercizio 1

## Descrizione

Deploy di un'applicazione web su tecnologia Java EE (Jakarta 11) tramite WildFly (38.0.0.Final) e Maven (3.9.11).

## Requisiti

- Java 25 o superiore

## Sviluppo

Non è necessario installare Maven localmente, in quanto il progetto include il wrapper Maven (`mvnw`). Per compilare il progetto, eseguire il seguente comando nella directory principale del progetto:

```bash
./mvnw clean package
```

### Deploy dell'Applicazione

Non è necessario installare un application server localmente, in quanto Maven scaricherà automaticamente il server WildFly durante la fase di `wildfly:start`.

```bash
./mvnw clean package wildfly:start wildfly:deploy
```

L'applicazione sarà accessibile all'indirizzo: [http://localhost:8080/dsm-ex1/](http://localhost:8080/dsm-ex1/)

### Interfaccia Amministrativa di WildFly

Per accedere all'interfaccia amministrativa di WildFly è necessario creare un utente amministrativo. Questo può essere fatto eseguendo il seguente comando

```bash
./target/server/bin/add-user.sh
```

Seguire le istruzioni a schermo per creare un utente di tipo "Management User". Una volta creato l'utente, l'interfaccia amministrativa sarà accessibile all'indirizzo: [http://localhost:9990/console](http://localhost:9990/console).

### Arresto del Server

Per arrestare il server WildFly, eseguire il seguente comando:

```bash
./mvnw wildfly:stop
```
