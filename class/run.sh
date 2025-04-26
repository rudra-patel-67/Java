# Check if 'wait' argument is passed
WAIT=false
if [[ "$1" == "wait" ]]; then
  WAIT=true
  for class_file in *.class; do
    # Get the class name by stripping .class extension
    class_name="${class_file%.class}"

    echo "Running $class_name..."
    echo ""
    java "$class_name"
    echo ""
    echo "---------------------------"
    echo ""

    # If wait flag is enabled, wait for Enter key
    if [ "$WAIT" = true ]; then
      read -p "Press Enter to run the next program..."
    fi
  done
else
  if [[ -n "$1" ]]; then
    echo ""
    java "$1"
    echo ""
    exit
  fi
fi