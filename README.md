# verif_internet_constant

Vérificateur de connexion internet
Un petit programme qui vérifie constamment la connexion internet et affiche un message si la connexion est perdue.

Comment ça marche
Le programme utilise la bibliothèque Python requests pour effectuer une requête GET à une URL arbitraire (par exemple, https://www.google.com). Si la requête échoue, cela signifie que la connexion internet est perdue et le programme affiche un message.

Le programme effectue la vérification de la connexion à intervalles réguliers (toutes les 10 secondes par défaut), mais cela peut être modifié dans le fichier de configuration.

Auteur
Ce programme a été créé par [Melvin Gueneau] et est distribué sous la licence MIT. Consultez le fichier LICENSE pour plus d'informations.
