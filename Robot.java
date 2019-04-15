package com.company;

public class Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean isMoved = false;
        for (int i = 0; i < 3 && !isMoved; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                isMoved = true;
            } catch (RobotConnectionException e) {
            }
        }
        if (!isMoved) {
            throw new RobotConnectionException("RobotConnectionException");
        }
    }
}
