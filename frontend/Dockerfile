FROM node:18-alpine

WORKDIR /app

# Copier les fichiers package.json + package-lock.json
COPY package*.json ./

# Installer les dépendances dont Angular CLI globalement
RUN npm install
RUN npm install -g @angular/cli

# Copier le reste du projet
COPY . .

EXPOSE 4200

# Commande de lancement en dev mode accessible de l’extérieur
CMD ["ng", "serve", "--host", "0.0.0.0"]
