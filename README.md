# RaidGlow

## Overview

RaidGlow is a Bukkit plugin for Minecraft servers that adds a glowing effect to raiders under specified conditions.

## Features

- Applies glowing effect to raiders based on a configurable condition.

## Installation

1. Download the latest `RaidGlow.jar` from the releases section.
2. Place the downloaded JAR file into your server's `plugins` directory.
3. Restart or reload your server.
4. A default configuration file will be generated, which you can modify as needed.

## Configuration

The `config.yml` file contains one main setting:

- `mobs_remaining_for_glow`: The number of mobs remaining in the raid for the glowing effect to activate. The default value is 2.

To modify this setting, edit the `config.yml` and either restart your server or reload the plugin.

## Usage

The plugin will automatically add a glowing effect to raiders based on the configured conditions.

## Development
### Building the Project

1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn clean package`.
4. The built JAR file will be in the `target` directory.