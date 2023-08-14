# Vehicle and Pedestrian Traffic Light Project

This project consists of implementing a traffic light system that controls the flow of vehicles and pedestrians at an intersection or crossing area. The system comprises traffic lights for vehicles and pedestrians, ensuring safety and traffic organization.

## Objectives

The main objective of this project is to create an efficient and safe traffic light system that enables orderly vehicle circulation and secure pedestrian crossing. Some specific objectives include:

- Controlling vehicle flow by alternating between traffic lanes according to each road's needs.
- Facilitating pedestrian crossing by providing appropriate times to cross safely.
- Minimizing waiting times for both vehicles and pedestrians.
- Implementing vehicle and pedestrian detection mechanisms to adjust traffic light timings based on actual flow.

## Operation

The traffic light system should operate as follows:

### Vehicle Traffic Light Sequence:

1. **Green for Main Road (MR)**: Vehicles on the main road have a green light, allowing them to proceed straight.

2. **Red for Main Road (MR)**: The signal for the main road turns red, while the signal for the secondary road turns green.

3. **Green for Secondary Road (SR)**: Vehicles on the secondary road have a green light, allowing them to proceed straight.

4. **Red for Secondary Road (SR)**: The signal for the secondary road turns red, and the signal for the main road turns green again.

### Pedestrian Traffic Light Sequence:

1. **Green for Pedestrians**: Pedestrians have a green signal, indicating they can cross the road.

2. **Red for Pedestrians and Flashing Green for Vehicles**: The pedestrian signal changes to red, while the signal for vehicles on the main road starts flashing, signaling that the road is about to close.

3. **Flashing Red for Vehicles**: The signal for vehicles on the main road continues flashing, indicating that the road is closed, and vehicles must stop before proceeding with caution.

4. **Green for Pedestrians and Flashing Red for Vehicles**: The pedestrian signal returns to green, allowing pedestrians to cross again, while the signal for vehicles on the main road remains flashing.

## Components and Technologies Used

- Microcontroller boards (e.g., Arduino, Raspberry Pi) to manage the operation of the traffic lights.
- LEDs of different colors to represent the traffic signals.
- Presence sensors (infrared, ultrasonic) to detect the presence of vehicles and pedestrians.
- Programming algorithms to control the logic of the traffic light operation and synchronization between lights.

## Usage Instructions

1. Assemble the vehicle and pedestrian traffic lights at the desired location, ensuring proper visibility.
2. Connect the electronic components according to the provided assembly diagram.
3. Load the program code onto the chosen microcontroller, ensuring that the described operational logic is implemented.
4. Test the system by observing the behavior of the traffic lights in various traffic and pedestrian crossing scenarios.
5. Make adjustments to the program or operational logic if necessary to optimize system performance.

## Final Considerations

This project aims to create an intelligent and effective traffic light system that enhances vehicle and pedestrian circulation, contributing to traffic safety and organization. It's important to conduct exhaustive testing and potential improvements to the code and system infrastructure to ensure reliable and safe operation.

